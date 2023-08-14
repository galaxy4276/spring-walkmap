package config.autoconfig;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
public class ServerProperties {

    private String contextPath;

    private int port;

}
