package com.kevin.springboot.error.springboot_error;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kevin.springboot.error.springboot_error.Models.domain.User;

@Configuration
public class AppConfig {

    

    @Bean
    public List<User> users(){
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "John", "Maria"));
        users.add(new User(2L, "Andres", "Suarez"));
        users.add(new User(3L, "Maria", "Nicol"));
        users.add(new User(4L, "Josefa", "Ramirez"));
        users.add(new User(5L, "Kevin", "Eslava"));
        users.add(new User(6L, "Leonardo", "Trujillo"));

        return users;
    }

}
