package com.konghq.testcontainers

import com.fasterxml.jackson.dataformat.yaml.YAMLMapper
import com.konghq.model.config.FRoute__2
import com.konghq.model.config.FService__1
import com.konghq.model.config.Kong
import groovy.util.logging.Slf4j
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

import static com.konghq.testcontainers.KongContainer.*
import static io.restassured.RestAssured.given
import static io.restassured.RestAssured.when
import static java.util.List.of
import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.containsString
import static org.hamcrest.Matchers.equalTo
import static org.testcontainers.utility.DockerImageName.parse
import static org.testcontainers.utility.MountableFile.forHostPath

@Slf4j
class KongServiceRouteTest {

  static KongContainer kongContainer = new KongContainer(parse(KONG_DEFAULT_TAG))
      .withEnv("KONG_DECLARATIVE_CONFIG", "/opt/kong/kong.yaml")
      .withExposedPorts(DEFAULT_ADMIN_PORT, DEFAULT_PROXY_PORT)
      .withCommand("kong start --v")

  @BeforeAll
  static void setup() {

    final FRoute__2 route = new FRoute__2()
        .withHosts(of("example.com"))
    final FService__1 service = new FService__1()
        .withName("example-service")
        .withUrl("https://mockbin.org")
        .withRoutes(of(route))

    final Kong kong = new Kong()
    kong.withFormatVersion("2.1")
        .withTransform(true)
        .withServices(of(service))

    final String kongYaml = new YAMLMapper().writeValueAsString(kong)

    def file = File.createTempFile("kong.yaml", null).with(true) { it ->
      it.write kongYaml.toString()
    }
    kongContainer
        .withCopyFileToContainer(forHostPath(file.absolutePath), "/opt/kong/kong.yaml")

    kongContainer.start()
  }

  @Test
  void "should match welcome message"() {
    when()
        .get(kongContainer.getaAdminUrl())
        .then()
        .statusCode(200)
        .body("tagline", containsString("Welcome to kong"))
  }

  @Test
  @DisplayName("Kong should proxy to Mockbin")
  void "should proxy"() {
    def htmlPath = given().header("Host", "example.com")
        .get(kongContainer.getProxyUrl())
        .peek()
        .then()
        .statusCode(200)
        .header("via", containsString("kong"))
        .extract().response().htmlPath()

    assertThat("Mockbin by Kong", equalTo(htmlPath.get("html.head.title")))
  }
}
