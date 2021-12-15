package com.konghq.testcontainers;


import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.BindMode;
import org.testcontainers.containers.output.Slf4jLogConsumer;
import org.testcontainers.utility.DockerImageName;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import lombok.extern.slf4j.Slf4j;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@Slf4j
public class KongContainerTest {

  @Test
  void smokeTest() {
    try (
        final var kongContainer = new KongContainer(DockerImageName.parse("kong:2.6.0-alpine"));

    ) {
      //kongContainer.withLogConsumer(new Slf4jLogConsumer(log));
      kongContainer.withClasspathResourceMapping("kong.yaml", "/opt/kong/kong.yaml", BindMode.READ_ONLY);
      kongContainer.withEnv("KONG_DECLARATIVE_CONFIG", "/opt/kong/kong.yaml");
      kongContainer.start();
    }
  }

  @Test
  void smokeTestAdmin() {
    try (final var kongContainer = new KongContainer(DockerImageName.parse("kong:2.6.0-alpine"))) {
      //kongContainer.withLogConsumer(new Slf4jLogConsumer(log));
      kongContainer.withClasspathResourceMapping("kong.yaml", "/opt/kong/kong.yaml", BindMode.READ_ONLY);
      kongContainer.withEnv("KONG_DECLARATIVE_CONFIG", "/opt/kong/kong.yaml");
      kongContainer.start();
      get(kongContainer.getaAdminUrl())
          //.peek()
          .then()
          .contentType(ContentType.JSON)
          .statusCode(200)
          .header("Server", equalTo("kong/2.6.0"));

      final JsonPath path = get(kongContainer.getaAdminUrl())
          //.peek()
          .then()
          .assertThat()
          .contentType(ContentType.JSON)
          .statusCode(200)
          .extract().response().jsonPath();

      assertThat("off", equalTo(path.get("configuration.database")));
    }
  }
}