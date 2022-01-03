package com.konghq.testcontainers;

import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.containers.output.Slf4jLogConsumer;
import org.testcontainers.containers.wait.strategy.DockerHealthcheckWaitStrategy;
import org.testcontainers.containers.wait.strategy.WaitStrategy;
import org.testcontainers.lifecycle.Startables;

import java.util.List;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import lombok.extern.slf4j.Slf4j;

import static com.konghq.testcontainers.KongContainer.DEFAULT_ADMIN_GUI_PORT;
import static com.konghq.testcontainers.KongContainer.DEFAULT_ADMIN_PORT;
import static com.konghq.testcontainers.KongContainer.DEFAULT_PROXY_PORT;
import static io.restassured.RestAssured.get;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsStringIgnoringCase;
import static org.hamcrest.Matchers.equalTo;
import static org.testcontainers.containers.BindMode.READ_ONLY;
import static org.testcontainers.utility.DockerImageName.*;

@Slf4j
public class KongContainerTest {

  @Test
  void smokeTest() {
    try (
        final var kongContainer = new KongContainer(parse("kong:2.6.0-alpine"));

    ) {
      //kongContainer.withLogConsumer(new Slf4jLogConsumer(log));
      kongContainer
          .withClasspathResourceMapping("kong.yaml", "/opt/kong/kong.yaml", READ_ONLY)
          .withEnv("KONG_DECLARATIVE_CONFIG", "/opt/kong/kong.yaml")
          .withCommand("kong start --v")
          .start();
    }
  }

  @Test
  void admin_url_should_be_exposed() {
    try (final var kongContainer = new KongContainer(parse("kong:2.6.0-alpine"))) {
      kongContainer.withLogConsumer(new Slf4jLogConsumer(log));
      kongContainer.withClasspathResourceMapping("kong.yaml", "/opt/kong/kong.yaml", READ_ONLY);
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