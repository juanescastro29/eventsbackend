package com.uptc.eventosbackend.service;

import com.uptc.eventosbackend.model.Activity;
import com.uptc.eventosbackend.repository.ActivityRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {

    @Autowired
    private ActivityRespository activityRespository;

    public Activity createActivity(Activity activity) {
        return activityRespository.save(activity);
    }

}
