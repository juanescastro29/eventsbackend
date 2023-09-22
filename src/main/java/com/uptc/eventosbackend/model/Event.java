package com.uptc.eventosbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eventId")
    private int eventId;

    @Column(name = "eventType")
    private String eventType;

    @Column(name = "eventValue")
    private double eventValue;

    @Column(name = "eventTotal")
    private double eventTotal;

    @OneToMany(mappedBy = "event")
    @JsonIgnore
    private List<Activity> activities;

    @ManyToMany
    @JoinTable(
            name = "event_assistants",
            joinColumns = @JoinColumn(name = "eventId"),
            inverseJoinColumns = @JoinColumn(name = "assistantId"))
    @JsonIgnore
    private List<Assistant> assistants;

    public Event() {

    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public double getEventValue() {
        return eventValue;
    }

    public double getEventTotal() {
        return eventTotal;
    }

    public void setEventTotal(double eventTotal) {
        this.eventTotal = eventTotal;
    }

    public void setEventValue(double eventValue) {
        this.eventValue = eventValue;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public List<Assistant> getAssistants() {
        return assistants;
    }

    public void setAssistants(List<Assistant> assistants) {
        this.assistants = assistants;
    }
}
