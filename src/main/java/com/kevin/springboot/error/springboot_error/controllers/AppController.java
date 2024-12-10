package com.kevin.springboot.error.springboot_error.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kevin.springboot.error.springboot_error.Models.domain.User;
import com.kevin.springboot.error.springboot_error.exceptions.UserNotFoundException;
import com.kevin.springboot.error.springboot_error.services.UserService;

import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String index(){
        int value = Integer.parseInt("10x");
        System.out.println(value);
        return "ok 200";
    }

    @GetMapping("/show/{id}")
    public User show(@PathVariable Long id) {
        User user = userService.findById(id).orElseThrow(() -> new UserNotFoundException("Error el usuario no existe!"));
        System.out.println(user.getName());
        return user;
    }
    
}
