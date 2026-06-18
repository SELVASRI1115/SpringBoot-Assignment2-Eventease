package com.Assignment2.Eventease.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Assignment2.Eventease.dto.EventDTO;
import com.Assignment2.Eventease.entity.Event;
import com.Assignment2.Eventease.service.EventService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping
    public ResponseEntity<Event> createEvent(
            @Valid
            @RequestBody EventDTO dto){

        Event event = new Event();

        event.setTitle(dto.getTitle());
        event.setDescription(dto.getDescription());
        event.setDate(dto.getDate());
        event.setLocation(dto.getLocation());

        return ResponseEntity.ok(
                eventService.createEvent(event));
    }

}