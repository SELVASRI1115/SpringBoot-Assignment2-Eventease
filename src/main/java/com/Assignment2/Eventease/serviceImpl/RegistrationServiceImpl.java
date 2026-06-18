package com.Assignment2.Eventease.serviceImpl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Assignment2.Eventease.entity.Event;
import com.Assignment2.Eventease.entity.Registration;
import com.Assignment2.Eventease.entity.User;
import com.Assignment2.Eventease.exception.ResourceNotFoundException;
import com.Assignment2.Eventease.repository.EventRepository;
import com.Assignment2.Eventease.repository.RegistrationRepository;
import com.Assignment2.Eventease.repository.UserRepository;
import com.Assignment2.Eventease.service.RegistrationService;

@Service
public class RegistrationServiceImpl
implements RegistrationService{

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private EventRepository eventRepo;

    @Autowired
    private RegistrationRepository registrationRepo;

    @Override
public Registration registerUser(
        Long userId,
        Long eventId){

    User user=userRepo.findById(userId)
            .orElseThrow(
            ()->new ResourceNotFoundException(
                    "User not found"));

    Event event=eventRepo.findById(eventId)
            .orElseThrow(
            ()->new ResourceNotFoundException(
                    "Event not found"));


    // Check duplicate registration

    Registration existing=
            registrationRepo
            .findByUserIdAndEventId(
                    userId,
                    eventId)
            .orElse(null);

    if(existing!=null){

        throw new RuntimeException(
                "User already registered for this event");
    }


    Registration registration=
            new Registration();

    registration.setUser(user);

    registration.setEvent(event);

    registration.setRegistrationDate(
            LocalDate.now());

    return registrationRepo.save(
            registration);

}

    @Override
    public List<Registration>
    getRegistrations(Long eventId){

        return registrationRepo
                .findByEventId(eventId);

    }

}