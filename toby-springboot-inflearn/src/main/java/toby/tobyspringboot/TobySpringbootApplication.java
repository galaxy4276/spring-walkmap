package toby.tobyspringboot;

import config.MySpringBootApplication;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@MySpringBootApplication
public class TobySpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(TobySpringbootApplication.class, args);
    }
}
