package com.uptc.eventosbackend.controller;

import com.uptc.eventosbackend.model.Activity;
import com.uptc.eventosbackend.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/activities")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @PostMapping()
    public String createActivity(@RequestBody Activity activity){
        activityService.createActivity(activity);
        return "Activity created";
    }

}
