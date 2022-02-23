package com.example.demo.api;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

public class UserController {

    // reference to the service
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void addUser(User user) {
        userService.addUser(user);
    }
}
