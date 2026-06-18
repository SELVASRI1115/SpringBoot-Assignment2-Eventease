package com.Assignment2.Eventease.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Assignment2.Eventease.dto.RegistrationDTO;
import com.Assignment2.Eventease.entity.Registration;
import com.Assignment2.Eventease.service.RegistrationService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/registrations")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping
    public ResponseEntity<Registration> registerUser(
            @Valid
            @RequestBody RegistrationDTO dto){

        return ResponseEntity.ok(
                registrationService.registerUser(
                        dto.getUserId(),
                        dto.getEventId()));
    }


    @GetMapping("/{eventId}")
    public List<Registration> getRegistrations(
            @PathVariable Long eventId){

        return registrationService
                .getRegistrations(eventId);
    }

}