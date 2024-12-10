package com.kevin.springboot.error.springboot_error.services;

import java.util.List;
import java.util.Optional;

import com.kevin.springboot.error.springboot_error.Models.domain.User;

public interface UserService {

    List<User> findAll();
    Optional<User> findById(Long id);   
}
