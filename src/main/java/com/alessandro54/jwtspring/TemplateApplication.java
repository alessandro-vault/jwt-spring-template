package com.alessandro54.jwtspring;

import com.alessandro54.jwtspring.domain.Role;
import com.alessandro54.jwtspring.service.UserService;
import com.alessandro54.jwtspring.domain.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class TemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateApplication.class, args);
    }

    @Bean
    BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));
            userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

            userService.saveUser(new User(null, "John", "john", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Alessandro", "hyper", "12345", new ArrayList<>()));

            userService.addRoleToUser("hyper", "ROLE_ADMIN");
            userService.addRoleToUser("hyper", "ROLE_USER");
            userService.addRoleToUser("john", "ROLE_USER");
        };
    }

}
