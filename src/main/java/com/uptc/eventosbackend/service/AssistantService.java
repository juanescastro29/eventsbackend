package com.uptc.eventosbackend.service;

import com.uptc.eventosbackend.model.Activity;
import com.uptc.eventosbackend.model.Assistant;
import com.uptc.eventosbackend.model.Event;
import com.uptc.eventosbackend.repository.AssistantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssistantService {

    @Autowired
    private AssistantRepository assistantRepository;

    public List<Activity> activitiesEvent(int eventId, int assistantId) {
        Assistant assistant = assistantRepository.findById(assistantId).get();
        List<Activity> activities = new ArrayList<>();
        for (int i = 0; i < assistant.getActivities().size(); i++) {
            if (assistant.getActivities().get(i).getEvent().getEventId() == eventId) {
                activities.add(assistant.getActivities().get(i));
            }
        }
        return activities;
    }


}
