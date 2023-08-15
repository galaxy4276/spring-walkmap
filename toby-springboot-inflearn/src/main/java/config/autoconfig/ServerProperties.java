package config.autoconfig;

import config.MyConfigurationProperties;
import lombok.Getter;
import lombok.Setter;

@MyConfigurationProperties(prefix = "server")
@Getter
@Setter
public class ServerProperties {

    private String contextPath;

    private int port;

}
