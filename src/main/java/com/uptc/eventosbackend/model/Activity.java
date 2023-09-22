package com.uptc.eventosbackend.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "activities")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "activityId")
    private int activityId;

    @Column(name = "activityType")
    private int activityType;

    @ManyToOne
    @JoinColumn(name = "eventId", referencedColumnName = "eventId", nullable = false)
    private Event event;

    @ManyToMany
    @JoinTable(
            name = "activity_assistants",
            joinColumns = @JoinColumn(name = "activityId"),
            inverseJoinColumns = @JoinColumn(name = "assistantId"))
    private List<Assistant> assistants;

    public Activity() {
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public int getActivityType() {
        return activityType;
    }

    public void setActivityType(int activityType) {
        this.activityType = activityType;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public List<Assistant> getAssistants() {
        return assistants;
    }

    public void setAssistants(List<Assistant> assistants) {
        this.assistants = assistants;
    }
}
