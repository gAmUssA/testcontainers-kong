package com.konghq.testcontainers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.output.Slf4jLogConsumer;

import io.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;

import static com.konghq.testcontainers.KongContainer.DEFAULT_ADMIN_GUI_PORT;
import static com.konghq.testcontainers.KongContainer.DEFAULT_ADMIN_PORT;
import static io.restassured.RestAssured.get;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsStringIgnoringCase;
import static org.hamcrest.Matchers.equalTo;
import static org.testcontainers.containers.BindMode.READ_ONLY;
import static org.testcontainers.utility.DockerImageName.parse;

@Slf4j
/*
  KongGatewayContainerTest uses enterprise edition Kong container
  @see https://hub.docker.com/r/kong/kong-gateway
 */
public class KongGatewaysContainerTest {

  static KongContainer kongContainer;

  @BeforeAll
  static void setupKongContainer() {
    kongContainer = new KongContainer(parse("kong/kong-gateway:2.6"));
    kongContainer
        .withLogConsumer(new Slf4jLogConsumer(log))
        .withClasspathResourceMapping("kong.yaml", "/opt/kong/kong.yaml", READ_ONLY)
        .withEnv("KONG_DECLARATIVE_CONFIG", "/opt/kong/kong.yaml")
        .withNetworkAliases("kong")
        .withEnv("KONG_ADMIN_GUI_URL", "http://kong" + DEFAULT_ADMIN_GUI_PORT)
        .withEnv("KONG_ADMIN_API_URI", "http://kong" + DEFAULT_ADMIN_PORT)
        .withExposedPorts(DEFAULT_ADMIN_PORT, DEFAULT_ADMIN_GUI_PORT)
        .start();
  }

  @Test
  @DisplayName("should run Kong EE")
  void should_run_enterprise_edition() {
    get(kongContainer.getaAdminUrl())
        //.peek()
        .then()
        .contentType(ContentType.JSON)
        .statusCode(200)
        .header("Server", containsStringIgnoringCase("enterprise-edition"));
  }

  @Test
  @DisplayName("should enable Kong Manager")
  void should_expose_admin_gui() {

    // using kong/kong-gateway enterprise edition
    // this test is inspired by SO https://stackoverflow.com/questions/70510441/not-able-to-reach-admin-api-through-kong-manager-gui-using-docker-compose
    var htmlPath = get(kongContainer.getaAdminGuiUrl())
        // .peek()
        .then()
        .assertThat()
        .contentType(ContentType.HTML)
        .statusCode(200)
        .extract().response().htmlPath();

    assertThat("Kong Admin", equalTo(htmlPath.get("html.head.title")));
  }
}

