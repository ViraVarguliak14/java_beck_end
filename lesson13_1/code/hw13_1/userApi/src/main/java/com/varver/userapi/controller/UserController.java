package com.varver.userapi.controller;

import com.varver.userapi.model.User;
import com.varver.userapi.repository.UserDB;
import com.varver.userapi.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    UserRepository repository = new UserDB();

    @GetMapping ("/users")
    public List<User> getUsers() {
        return repository.findAll();
    }

    @GetMapping("/users/{id}")
    public User getById(@PathVariable(name = "id") Long userId){
        return repository.findById(userId);
        //return repository.findAll().stream().filter(u->u.getName().equals(userId)).findFirst().get();
    }

    @PostMapping("/users")
    public User  addUser(@RequestBody User user){
        return repository.save(user);
    }
}
