package toby.tobyspringboot;

import config.MySpringBootApplication;
import org.springframework.boot.SpringApplication;

@MySpringBootApplication
public class TobySpringbootApplication {

//    @Bean
//    public ServletWebServerFactory servletWebServerFactory() {
//        return new TomcatServletWebServerFactory();
//    }
//
//    @Bean
//    public DispatcherServlet dispatcherServlet() {
//        return new DispatcherServlet();
//    }

    public static void main(String[] args) {
//        MySpringApplication.run(TobySpringbootApplication.class, args);
        SpringApplication.run(TobySpringbootApplication.class, args);
    }

}
