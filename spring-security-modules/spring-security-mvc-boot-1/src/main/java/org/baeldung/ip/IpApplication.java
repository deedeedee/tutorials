package org.baeldung.ip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan("org.baeldung.ip")
@PropertySource("classpath:application-defaults.properties")
public class IpApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(IpApplication.class, args);
    }
}
