package com.example.h2dbtest.controller;

import com.example.h2dbtest.dto.UserDTO;
import com.example.h2dbtest.model.User;
import com.example.h2dbtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public User addUser(@RequestBody UserDTO userDTO){
        return userService.addUser(userDTO);
    }

    @GetMapping("/getall")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/getbyid/{id}")
    public Optional<User> getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

    @PutMapping("/Update/{id}")
    public User updateUser(@PathVariable int id, @RequestBody UserDTO userDTO){
        return userService.updateUser(id, userDTO);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUserById(@PathVariable int id){
        return userService.deleteUserById(id);
    }
}
