package org.example.controller;

import org.example.model.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user")
    User userByName(@RequestParam List<String> name) {
        return userService.findByName(name.get(0));
    }
    @GetMapping("/user/{id}")
    User userById(@PathVariable Long id) {
        return userService.findById(id);
    }
}
