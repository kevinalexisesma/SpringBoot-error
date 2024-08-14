package com.kevin.springboot.error.springboot_error.services;

import java.util.List;

import com.kevin.springboot.error.springboot_error.Models.domain.User;

public interface UserService {

    List<User> findAll();
    User findById(Long id);   
}
