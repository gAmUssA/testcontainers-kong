package com.konghq.testcontainers;

import org.junit.jupiter.api.Test;
import org.testcontainers.containers.BindMode;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.containers.output.Slf4jLogConsumer;
import org.testcontainers.utility.DockerImageName;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import lombok.extern.slf4j.Slf4j;

import static com.konghq.testcontainers.KongContainer.DEFAULT_PROXY_PORT;
import static io.restassured.RestAssured.DEFAULT_PORT;
import static io.restassured.RestAssured.get;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsStringIgnoringCase;
import static org.hamcrest.Matchers.equalTo;

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

  @Test
  void testQuoteService() {
    try (final var kongContainer = new KongContainer(DockerImageName.parse("kong:2.6.0-alpine"))) {
      //kongContainer.withLogConsumer(new Slf4jLogConsumer(log));

      kongContainer
          .withNetwork(Network.newNetwork())
          .withClasspathResourceMapping("kong-quotes.yaml", "/opt/kong/quotes.yaml", BindMode.READ_ONLY)
          .withEnv("KONG_DECLARATIVE_CONFIG", "/opt/kong/quotes.yaml")
          .withLogConsumer(new Slf4jLogConsumer(log))
          .withExposedPorts(DEFAULT_PROXY_PORT);

      var quoteService = new GenericContainer<>(DockerImageName.parse("gamussa/native-quote-service:0.0.4-SNAPSHOT"));
      quoteService
          .withNetworkAliases("quotes", "quote-service")
          .withNetwork(kongContainer.getNetwork())
          // .withLogConsumer(new Slf4jLogConsumer(log))
          .withExposedPorts(8080);

      kongContainer.start();
      quoteService.start();

      get(String.format("http://%s:%s", quoteService.getHost(), quoteService.getMappedPort(8080)))
          .peek();

      get(String.format("http://%s:%s/", kongContainer.getHost(), kongContainer.getMappedPort(DEFAULT_PROXY_PORT)))
          .then()
          .header("Via", containsStringIgnoringCase("kong"));
    }
  }
}