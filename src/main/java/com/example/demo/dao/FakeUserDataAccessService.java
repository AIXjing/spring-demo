package com.example.demo.dao;

import com.example.demo.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FakeUserDataAccessService implements UserDao {

    private static List<User> DB = new ArrayList<>();

    @Override
    public int insertUser(UUID id, User user) {
        DB.add(new User(id, user.getName()));
        return 1;
    }
}
