package com.Assignment2.Eventease.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserDTO {

    @NotNull(message = "Name cannot be null")
    @Size(min = 3, max = 50,
            message = "Name should contain 3 to 50 characters")
    private String name;

    @NotNull(message = "Email cannot be null")
    @Email(message = "Enter valid email")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    // Generate Getters and Setters
        
}