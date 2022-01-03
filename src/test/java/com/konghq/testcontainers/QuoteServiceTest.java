package com.konghq.testcontainers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.lifecycle.Startables;

import java.util.List;

import static com.konghq.testcontainers.KongContainer.DEFAULT_PROXY_PORT;
import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.containsStringIgnoringCase;
import static org.testcontainers.containers.BindMode.READ_ONLY;
import static org.testcontainers.utility.DockerImageName.parse;

public class QuoteServiceTest {

  @Test
  @DisplayName("should expose QuoteService via declarative config")
  void should_expose_QuoteService() {
    try (final var kong = new KongContainer(parse("kong:2.6.0-alpine"))) {

      kong
          .withNetwork(Network.newNetwork())
          .withClasspathResourceMapping("kong-quotes.yaml",
                                        "/opt/kong/quotes.yaml",
                                        READ_ONLY)
          .withEnv("KONG_DECLARATIVE_CONFIG", "/opt/kong/quotes.yaml")
          //.withLogConsumer(new Slf4jLogConsumer(log))
          .withExposedPorts(DEFAULT_PROXY_PORT);

      var quotes = new GenericContainer<>(parse("gamussa/native-quote-service:0.0.4-SNAPSHOT"));
      quotes
          .withNetworkAliases("quotes", "quote-service")
          .withNetwork(kong.getNetwork())
          // .withLogConsumer(new Slf4jLogConsumer(log))
          .withExposedPorts(8080);

      Startables.deepStart(List.of(kong, quotes)).join();

      get(String.format("http://%s:%s", quotes.getHost(), quotes.getMappedPort(8080))).peek();

      get(String.format("http://%s:%s/", kong.getHost(), kong.getMappedPort(DEFAULT_PROXY_PORT)))
          .peek()
          .then()
          .header("Via", containsStringIgnoringCase("kong"));
    }
  }

}
