package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user) {
        User existingUser = userService.getUserById(id);
        if (existingUser != null) {
            existingUser.setUserName(user.getUserName());
            existingUser.setPassword(user.getPassword());
            return userService.updateUser(existingUser);
        }
        return null;
    }

    @PatchMapping("/{id}")
    public User partiallyUpdateUser(@PathVariable int id, @RequestBody User user) {
        User existingUser = userService.getUserById(id);
        if (existingUser != null) {
            if (user.getUserName() != null) {
                existingUser.setUserName(user.getUserName());
            }
            if (user.getPassword() != null) {
                existingUser.setPassword(user.getPassword());
            }
            return userService.updateUser(existingUser);
        }
        return null;
    }
}
