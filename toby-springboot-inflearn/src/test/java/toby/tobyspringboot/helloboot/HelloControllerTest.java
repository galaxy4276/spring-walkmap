package toby.tobyspringboot.helloboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import toby.tobyspringboot.HelloController;

public class HelloControllerTest {

    @Test
    void helloController() {
        HelloController helloController = new HelloController(name -> name);

        String ret = helloController.hello("Test");

        Assertions.assertThat(ret).isEqualTo("Test");
    }

    @Test
    void failsHelloController() {
        HelloController controller = new HelloController(name -> name);

        Assertions.assertThatThrownBy(() -> controller.hello(null))
                .isInstanceOf(IllegalArgumentException.class);

        Assertions.assertThatThrownBy(() -> controller.hello("  "))
                .isInstanceOf(IllegalArgumentException.class);
    }

}
