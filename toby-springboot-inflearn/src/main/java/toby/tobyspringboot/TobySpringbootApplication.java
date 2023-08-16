package toby.tobyspringboot;

import config.MySpringBootApplication;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

@MySpringBootApplication
@RequiredArgsConstructor
public class TobySpringbootApplication {
    private final JdbcTemplate jdbcTemplate;

    @PostConstruct
    void init() {
        jdbcTemplate.execute("create table if not exists hello(name varchar(50) primary key, count int)");
    }

    public static void main(String[] args) {
        SpringApplication.run(TobySpringbootApplication.class, args);
    }
}
