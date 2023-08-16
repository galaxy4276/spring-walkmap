package toby.tobyspringboot.helloboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import toby.tobyspringboot.HelloRepository;
import toby.tobyspringboot.HelloService;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.*;

@HelloBootTest
public class HelloServiceCountTest {
    @Autowired
    HelloService helloService;

    @Autowired
    HelloRepository helloRepository;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void sayHelloIncreaseCount() {
        IntStream.rangeClosed(1, 10).forEach(i -> {
            helloService.sayHello("은기");
            assertThat(helloRepository.countOf("은기")).isEqualTo(i);
        });
    }
}
