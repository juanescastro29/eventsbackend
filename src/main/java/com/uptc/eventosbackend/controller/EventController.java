package com.uptc.eventosbackend.controller;

import com.uptc.eventosbackend.model.Assistant;
import com.uptc.eventosbackend.model.Event;
import com.uptc.eventosbackend.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(name = "/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping()
    public String createEvent(@RequestBody Event event) {
        eventService.createEvent(event);
        return "Event created";
    }

    @GetMapping()
    public List<Event> getEvents() {
        return eventService.getEvents();
    }

    @GetMapping("/{eventId}")
    public ResponseEntity<Object> getAssistants(@PathVariable Integer eventId) {
        Map<String, Object> response = new HashMap<>();
        List<Assistant> assistants = eventService.getAssistants(eventId);
        if (assistants.size() > 0) {
            response.put("Data", assistants);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        response.put("Message", "Not assistants for the event");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }




}
