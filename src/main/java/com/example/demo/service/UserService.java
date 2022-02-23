package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service // or @Component to be specific
public class UserService {
    private final UserDao userDao;

    @Autowired // autowire this service to this interface
    public UserService(@Qualifier("postgres") UserDao userDao) { // @Qualifier("fakeDao") if use a fake database
        this.userDao = userDao;
    }

    public int addUser(User user) {
        return userDao.insertUser(user);
    }

    public List<User> getAllUser() {
        return userDao.selectAllUsers();
    }

    public User getUserById (UUID id) {
        return userDao.selectUserById(id)
                .orElse(null);
    }

    public int deleteUserById (UUID id) {
        return userDao.deleteUserById(id);
    }

    public int updateUserById (UUID id, User newUser) {
        return userDao.updateUserById(id, newUser);
    }
}
