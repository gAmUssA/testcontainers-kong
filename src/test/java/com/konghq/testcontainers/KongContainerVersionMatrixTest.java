package com.konghq.testcontainers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import io.restassured.http.ContentType;

import static com.konghq.testcontainers.KongContainer.KONG_COMMUNITY_IMAGE;
import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;
import static org.testcontainers.containers.BindMode.READ_ONLY;
import static org.testcontainers.utility.DockerImageName.parse;

public class KongContainerVersionMatrixTest {

  @ParameterizedTest(name = "should expose Admin URL (with Kong v{0})")
  @ValueSource(strings = {"2.6.0", "2.7.0"})
  void should_expose_admin_url(String version) {
    try (final var kongContainer = new KongContainer(parse(KONG_COMMUNITY_IMAGE + ":" + version));) {

      //kongContainer.withLogConsumer(new Slf4jLogConsumer(log));
      kongContainer
          .withClasspathResourceMapping("kong.yaml", "/opt/kong/kong.yaml", READ_ONLY)
          .withEnv("KONG_DECLARATIVE_CONFIG", "/opt/kong/kong.yaml")
          .withCommand("kong start --v")
          .start();

      get(kongContainer.getaAdminUrl())
          //.peek()
          .then()
          .contentType(ContentType.JSON)
          .statusCode(200)
          .header("Server", equalTo("kong/" + version));
    }
  }
}
