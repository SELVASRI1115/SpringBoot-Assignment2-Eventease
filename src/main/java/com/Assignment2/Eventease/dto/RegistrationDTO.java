package com.Assignment2.Eventease.dto;

import jakarta.validation.constraints.NotNull;

public class RegistrationDTO {

    @NotNull(message = "User ID required")
    private Long userId;

    @NotNull(message = "Event ID required")
    private Long eventId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }


    // Generate Getters and Setters
    
}