package com.konghq.testcontainers

import com.fasterxml.jackson.dataformat.yaml.YAMLMapper
import com.konghq.model.config.FConsumer
import com.konghq.model.config.FPlugin
import com.konghq.model.config.FPlugin__1
import com.konghq.model.config.FPlugin__5
import com.konghq.model.config.FRoute__2
import com.konghq.model.config.FService__1
import com.konghq.model.config.KeyAuth
import com.konghq.model.config.Kong
import groovy.util.logging.Slf4j
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.testcontainers.containers.output.Slf4jLogConsumer

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
class KongServiceRoutePluginTest {

  static KongContainer kongContainer = new KongContainer(parse(KONG_DEFAULT_TAG))
      .withEnv("KONG_DECLARATIVE_CONFIG", "/opt/kong/kong.yaml")
      .withExposedPorts(DEFAULT_PROXY_PORT)
      .withCommand("kong start --v")


  @BeforeAll
  static void setup() {

    final FRoute__2 route = new FRoute__2()
        .withHosts(of("example.com"))
    final FService__1 service = new FService__1()
        .withName("example-service")
        .withUrl("https://mockbin.org")
        .withRoutes(of(route))
        .withPlugins(of(new FPlugin__5().withName("key-auth")))

    def keyAuth = new KeyAuth()
    keyAuth.withKey("SHAZAM")
    def bob = new FConsumer()
    bob.withKeyauthCredentials(of(keyAuth)).withUsername("bob")

    final Kong kong = new Kong()
    kong.withFormatVersion("2.1")
        .withTransform(true)
        .withServices(of(service))
        .withConsumers(of(bob))

    final String kongYaml = new YAMLMapper().writeValueAsString(kong)
    println kongYaml

    def file = File.createTempFile("kong.yaml", null).with(true) { it ->
      it.write kongYaml.toString()
    }
    kongContainer
        .withCopyFileToContainer(forHostPath(file.absolutePath), "/opt/kong/kong.yaml")

    kongContainer.withLogConsumer(new Slf4jLogConsumer(log))
    kongContainer.start()
  }
  
  @Test
  @DisplayName("Should return 401 from Kong")
  void "should proxy"() {
    def jsonPath = given()
        .header("Host", "example.com")
        .get(kongContainer.getProxyUrl())
        .peek()
        .then()
        .statusCode(401)
        .header("Server", containsString("kong"))
        .extract().response().jsonPath()

    assertThat("No API key found in request", equalTo(jsonPath.get("message")))
  }

  @Test
  @DisplayName("Should return 200 with key")
  void "should 200"() {
    def htmlPath = given()
        .header("Host", "example.com")
        .header("apiKey", "SHAZAM")
        .get(kongContainer.getProxyUrl())
        .peek()
        .then()
        .statusCode(200)
        .header("Server", containsString("cloudflare"))
        .header("via", containsString("kong"))
        .extract().response().htmlPath()

    assertThat("Mockbin by Kong", equalTo(htmlPath.get("html.head.title")))
  }
}
