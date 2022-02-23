package com.example.demo.dao;

import com.example.demo.model.User;

import java.util.UUID;

public interface UserDao {

    // a method return id given id is known
    int insertUser(UUID id, User user);

    // a method to generate a random id and add it to the user
    default int insertUser(User user) {
        UUID id = UUID.randomUUID();
        return insertUser(id, user);
    }

}
