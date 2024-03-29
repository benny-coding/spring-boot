package grp.ohdong;

import grp.ohdong.configuration.ServiceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@Configuration
@Import(ServiceConfig.class)
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World";
    }
    public static void main(String[] args){
        SpringApplication.run(Example.class, args);
    }
}
