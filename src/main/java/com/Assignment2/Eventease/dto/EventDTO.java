package com.Assignment2.Eventease.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class EventDTO {

    @NotNull(message = "Title cannot be null")
    @Size(min = 3, max = 50,
            message = "Title should contain 3 to 50 characters")
    private String title;

    @NotNull(message = "Description required")
    private String description;

    @NotNull(message = "Date required")
    private LocalDate date;

    @NotNull(message = "Location required")
    private String location;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    // Generate Getters and Setters
        
}