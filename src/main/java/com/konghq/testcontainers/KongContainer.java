package com.konghq.testcontainers;

import org.testcontainers.containers.GenericContainer;
import org.testcontainers.utility.DockerImageName;


public class KongContainer extends GenericContainer<KongContainer> {

  final static String KONG_COMMUNITY_IMAGE = "kong";
  final static String KONG_EE_IMAGE = "kong/kong-gateway";
  
  public static final String KONG_DEFAULT_TAG = KONG_COMMUNITY_IMAGE + ":2.6.0";
  private static final DockerImageName DEFAULT_IMAGE_NAME = DockerImageName.parse(KONG_COMMUNITY_IMAGE);

  private static final DockerImageName ENTERPRISE_IMAGE_NAME = DockerImageName.parse(KONG_EE_IMAGE);

  public static int DEFAULT_PROXY_PORT = 8000;
  public static int DEFAULT_ADMIN_PORT = 8001;

  public static int DEFAULT_ADMIN_GUI_PORT = 8002;
  // TODO 
  private final boolean enableAdmin;

  public KongContainer(DockerImageName dockerImageName) {
    this(dockerImageName, true);
  }

  public KongContainer(DockerImageName dockerImageName, final boolean enableAdmin) {
    super(dockerImageName);
    this.enableAdmin = enableAdmin;

    dockerImageName.assertCompatibleWith(DEFAULT_IMAGE_NAME, ENTERPRISE_IMAGE_NAME);

    withEnv("KONG_DATABASE", "off");
    withEnv("KONG_PROXY_ACCESS_LOG", "/dev/stdout");
    withEnv("KONG_ADMIN_ACCESS_LOG", "/dev/stdout");
    withEnv("KONG_PROXY_ERROR_LOG", "/dev/stderr");
    withEnv("KONG_ADMIN_ERROR_LOG", "/dev/stderr");
    //withEnv("KONG_ADMIN_LISTEN", "0.0.0.0:8001, 0.0.0.0:8444 ssl");
    if (this.enableAdmin) {
      withEnv("KONG_ADMIN_LISTEN", "0.0.0.0:" + DEFAULT_ADMIN_PORT);
      withExposedPorts(DEFAULT_ADMIN_PORT);
    }
    withCommand("kong start");
  }

  public String getaAdminUrl() {
    return String.format("http://%s:%s", getHost(), getMappedPort(DEFAULT_ADMIN_PORT));
  }

  public String getaAdminGuiUrl() {
    return String.format("http://%s:%s", getHost(), getMappedPort(DEFAULT_ADMIN_GUI_PORT));
  }

}
