package com.kevin.springboot.error.springboot_error.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kevin.springboot.error.springboot_error.Models.domain.Role;
import com.kevin.springboot.error.springboot_error.Models.domain.User;

@Service
public class UserServiceImpl implements UserService {

    private List<User> users;

    public UserServiceImpl (){
        users = new ArrayList<>();
        users.add(new User(1L, "John", "Maria"));
        users.add(new User(2L, "Andres", "Suarez"));
        users.add(new User(3L, "Maria", "Nicol"));
        users.add(new User(4L, "Josefa", "Ramirez"));
        users.add(new User(5L, "Kevin", "Eslava"));
        users.add(new User(6L, "Leonardo", "Trujillo"));
    }

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
