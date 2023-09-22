package com.uptc.eventosbackend.service;

import com.uptc.eventosbackend.model.Assistant;
import com.uptc.eventosbackend.model.Event;
import com.uptc.eventosbackend.repository.EventRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRespository eventRespository;

    public Event createEvent(Event event) {
        return eventRespository.save(event);
    }

    public List<Event> getEvents() {
        return eventRespository.findAll();
    }

    public List<Assistant> getAssistants(int eventId) {
        Event event = eventRespository.findById(eventId).get();
        return event.getAssistants();
    }

    public double totalEvent(int eventId) {
        Event event = eventRespository.findById(eventId).get();
        return event.getEventTotal();
    }



}
