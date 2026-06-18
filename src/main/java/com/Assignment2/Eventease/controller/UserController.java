package com.Assignment2.Eventease.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Assignment2.Eventease.dto.UserDTO;
import com.Assignment2.Eventease.entity.User;
import com.Assignment2.Eventease.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(
            @Valid
            @RequestBody UserDTO dto){

        User user = new User();

        user.setName(dto.getName());
        user.setEmail(dto.getEmail());

        return ResponseEntity.ok(
                userService.createUser(user));
    }

}