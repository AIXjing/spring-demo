package com.example.demo.api;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/user")
@RestController
public class UserController {

  // reference to the service
  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping
  public void addUser(@Validated @NonNull @RequestBody User user) {
    userService.addUser(user);
  }

  @GetMapping
  public List<User> getAllUser() {
    return userService.getAllUser();
  }

  @GetMapping(path = "{id}")
  public User getUserById(@PathVariable("id") UUID id) {
    return userService.getUserById(id);
  }

  @DeleteMapping(path = "{id}")
  public void deleteUserById(@PathVariable("id") UUID id) {
    userService.deleteUserById(id);
  }

  @PutMapping(path = "{id}")
  public void updateUserById(@PathVariable("id") UUID id, @Validated @NonNull @RequestBody User newUser) {
    userService.updateUserById(id, newUser);
  }
}
