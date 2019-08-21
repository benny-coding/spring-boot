package grp.ohdong.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import grp.ohdong.user.UserService;

@Configuration
public class ServiceConfig {

    @Bean
    public UserService userService() {

        return new UserService();
    }
}
