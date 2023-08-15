package config.autoconfig;

import config.MyConfigurationProperties;
import lombok.Getter;
import lombok.Setter;

@MyConfigurationProperties(prefix = "data")
@Getter
@Setter
public class MyDataSourceProperties {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
}
