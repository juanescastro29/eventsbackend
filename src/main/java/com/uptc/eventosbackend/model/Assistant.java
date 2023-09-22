package com.uptc.eventosbackend.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "assistants")
public class Assistant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assistantId")
    private int assistantId;

    @Column(name = "assistantType")
    private int assistantType;

    @ManyToMany(mappedBy = "assistants")
    private List<Event> events;

    @ManyToMany(mappedBy = "assistants")
    private List<Activity> activities;

    public Assistant() {

    }

    public int getAssistantId() {
        return assistantId;
    }

    public void setAssistantId(int assistantId) {
        this.assistantId = assistantId;
    }

    public int getAssistantType() {
        return assistantType;
    }

    public void setAssistantType(int assistantType) {
        this.assistantType = assistantType;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }
}
