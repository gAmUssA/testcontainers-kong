package com.konghq.testcontainers;

import org.testcontainers.containers.GenericContainer;
import org.testcontainers.utility.DockerImageName;


public class KongContainer extends GenericContainer<KongContainer> {

  private static final DockerImageName DEFAULT_IMAGE_NAME = DockerImageName.parse("kong");
  private static final String DEFAULT_TAG = "2.6.0-alpine";
  private static int DEFAULT_ADMIN_PORT = 8001;
  private boolean enableAdmin;

  public KongContainer(DockerImageName dockerImageName) {
    this(dockerImageName, true);
  }

  public KongContainer(DockerImageName dockerImageName, final boolean enableAdmin) {
    super(dockerImageName);
    this.enableAdmin = enableAdmin;

    dockerImageName.assertCompatibleWith(DEFAULT_IMAGE_NAME);

    withEnv("KONG_DATABASE", "off");
    withEnv("KONG_PROXY_ACCESS_LOG", "/dev/stdout");
    withEnv("KONG_ADMIN_ACCESS_LOG", "/dev/stdout");
    withEnv("KONG_PROXY_ERROR_LOG", "/dev/stderr");
    withEnv("KONG_ADMIN_ERROR_LOG", "/dev/stderr");
    //withEnv("KONG_ADMIN_LISTEN", "0.0.0.0:8001, 0.0.0.0:8444 ssl");
    //if (this.enableAdmin) {
      withEnv("KONG_ADMIN_LISTEN", "0.0.0.0:" + DEFAULT_ADMIN_PORT);
      withExposedPorts(DEFAULT_ADMIN_PORT);
    //}
    
    //withCommand("kong start");
    withCommand("kong start --v");
  }

  public String getaAdminUrl() {
    return String.format("http://%s:%s", getHost(), getMappedPort(DEFAULT_ADMIN_PORT));
  }

}
