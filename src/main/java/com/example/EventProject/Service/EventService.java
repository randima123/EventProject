package com.example.EventProject.Service;

import com.example.EventProject.Model.Event;
import com.example.EventProject.Repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventService {

    @Autowired
    EventRepository eventRepository;

    public Iterable<Event> getAllEvents()
    {

        return eventRepository.findAll();

    }

}
