package com.uptc.eventosbackend.controller;

import com.uptc.eventosbackend.model.Assistant;
import com.uptc.eventosbackend.service.AssistantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/assistants")
public class AssistantController {

    @Autowired
    private AssistantService assistantService;

    @PostMapping()
    public String createAssistant(@RequestBody Assistant assistant) {
        assistantService.createAssistant(assistant);
        return "Assistant created";
    }

}
