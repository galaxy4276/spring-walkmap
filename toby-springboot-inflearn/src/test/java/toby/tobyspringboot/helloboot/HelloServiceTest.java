package toby.tobyspringboot.helloboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import toby.tobyspringboot.Hello;
import toby.tobyspringboot.HelloDecorator;
import toby.tobyspringboot.HelloRepository;
import toby.tobyspringboot.SimpleHelloService;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@UnitTest
@interface FastUnitTest { }

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Test
@interface UnitTest {}

public class HelloServiceTest {

    @FastUnitTest
    void simpleHelloService() {
        SimpleHelloService helloService = new SimpleHelloService(new HelloRepository() {
            @Override
            public Hello findHello(String name) {
                return null;
            }

            @Override
            public void increaseCount(String name) {}
        });

        String ret = helloService.sayHello("Test");
        Assertions.assertThat(ret).isEqualTo("Hello Test");
    }

    @FastUnitTest
    void helloDecorator() {
        HelloDecorator decorator = new HelloDecorator(name -> name);
        String ret = decorator.sayHello("Test");
        Assertions.assertThat(ret).isEqualTo("*Test*");
    }

}
