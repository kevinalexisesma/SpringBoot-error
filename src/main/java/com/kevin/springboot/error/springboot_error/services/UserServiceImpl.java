package com.kevin.springboot.error.springboot_error.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.springboot.error.springboot_error.Models.domain.Role;
import com.kevin.springboot.error.springboot_error.Models.domain.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private List<User> users;

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public Optional<User> findById(Long id) {
        User userR = null;
        for (User user : users) {
            if(user.getId() == id)
            {
                userR = user;
                break;
            }

        }
        return Optional.ofNullable(userR);
    }


}
