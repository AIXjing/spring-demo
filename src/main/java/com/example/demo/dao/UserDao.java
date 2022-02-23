package com.example.demo.dao;

import com.example.demo.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

// this is an interface to connect database
public interface UserDao {

    // a method return id given id is known
    int insertUser(UUID id, User user);

    // a method to generate a random id and add it to the user
    default int insertUser(User user) {
        UUID id = UUID.randomUUID();
        return insertUser(id, user);
    }

    List<User> selectAllUsers();

    Optional<User> selectUserById(UUID id);
    int deleteUserById(UUID id);
    int updateUserById(UUID id, User user);

}
