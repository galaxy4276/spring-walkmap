package toby.tobyspringboot.helloboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import toby.tobyspringboot.Hello;
import toby.tobyspringboot.HelloRepository;
import toby.tobyspringboot.HelloRepositoryJdbc;

import static org.assertj.core.api.Assertions.*;

@HelloBootTest
public class HelloRepositoryTest {
    @Autowired
    HelloRepository helloRepository;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void findHelloFailed() {
        Hello hello = helloRepository.findHello("은기");
        assertThat(hello).isNull();
    }

    @Test
    void increaseCount() {
        helloRepository.increaseCount("은기");
        assertThat(helloRepository.countOf("은기")).isEqualTo(1);

        helloRepository.increaseCount("은기");
        assertThat(helloRepository.countOf("은기")).isEqualTo(2);
    }
}
