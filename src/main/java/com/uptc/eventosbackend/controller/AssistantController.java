package com.uptc.eventosbackend.controller;

import com.uptc.eventosbackend.model.Activity;
import com.uptc.eventosbackend.service.AssistantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/assistants")
public class AssistantController {

    @Autowired
    private AssistantService assistantService;

    @GetMapping("/{eventId}/{assistantId}")
    public ResponseEntity<Object> activities(@PathVariable Integer eventId, @PathVariable Integer assistantId) {
        HashMap<String, Object> response = new HashMap<>();
        List<Activity> activities = assistantService.activitiesEvent(eventId, assistantId);
        if (activities.size() > 0) {
            response.put("Data", activities);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        response.put("Message", "No event or assistant found");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
