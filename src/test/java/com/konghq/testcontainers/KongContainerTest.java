package com.konghq.testcontainers;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.output.Slf4jLogConsumer;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import lombok.extern.slf4j.Slf4j;

import static com.konghq.testcontainers.KongContainer.KONG_DEFAULT_TAG;
import static io.restassured.RestAssured.get;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.testcontainers.containers.BindMode.READ_ONLY;
import static org.testcontainers.utility.DockerImageName.*;

@Slf4j
public class KongContainerTest {

  static KongContainer kongContainer;

  @BeforeAll
  static void startKong() {

    kongContainer = new KongContainer(parse(KONG_DEFAULT_TAG));

    //kongContainer.withLogConsumer(new Slf4jLogConsumer(log));
    kongContainer
        .withClasspathResourceMapping("kong.yaml", "/opt/kong/kong.yaml", READ_ONLY)
        .withEnv("KONG_DECLARATIVE_CONFIG", "/opt/kong/kong.yaml")
        .withCommand("kong start --v")
        .start();
  }


  @Test
  @DisplayName("should expose Admin URL")
  void should_expose_admin_url() {
    get(kongContainer.getaAdminUrl())
        //.peek()
        .then()
        .contentType(ContentType.JSON)
        .statusCode(200)
        .header("Server", equalTo("kong/2.6.0"));
  }

  @Test
  @DisplayName("should run Kong in dbless mode")
  void should_run_in_dbless_mode() {
    final JsonPath path = get(kongContainer.getaAdminUrl())
        //.peek()
        .then()
        .assertThat()
        .contentType(ContentType.JSON)
        .statusCode(200)
        .extract().response().jsonPath();

    assertThat("off", equalTo(path.get("configuration.database")));
  }

  @AfterAll
  static void cleanup() {
    kongContainer.close();
  }
}