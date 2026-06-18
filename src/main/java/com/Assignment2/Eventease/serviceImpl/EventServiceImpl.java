package com.Assignment2.Eventease.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Assignment2.Eventease.entity.Event;
import com.Assignment2.Eventease.repository.EventRepository;
import com.Assignment2.Eventease.service.EventService;

@Service
public class EventServiceImpl
implements EventService{

    @Autowired
    private EventRepository eventRepo;

    @Override
    public Event createEvent(Event event){

        if(event==null){
            throw new RuntimeException(
                    "Event cannot be null");
        }

        if(event.getTitle()==null ||
           event.getTitle().trim().isEmpty()){

            throw new RuntimeException(
                    "Title cannot be empty");
        }

        return eventRepo.save(event);

    }

}