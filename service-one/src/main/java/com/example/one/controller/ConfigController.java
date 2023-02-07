package com.example.one.controller;

import com.example.one.OneConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {
    private final OneConfiguration oneConfiguration;

    @Autowired
    ConfigController(OneConfiguration oneConfiguration) {
        this.oneConfiguration = oneConfiguration;
    }

    @GetMapping("/message/profile")
    public String getOneConfig_message_profile(){
        return oneConfiguration.getProfile();
    }
}
