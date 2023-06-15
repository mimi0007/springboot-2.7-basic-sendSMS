package com.example.springbootsendotptwilio.controller;

import com.example.springbootsendotptwilio.model.SMSSendRequest;
import com.example.springbootsendotptwilio.service.SMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SMSController {

    @Autowired
    public SMSService smsService;

    @PostMapping("/processSMS")
    public void sendSMS(@RequestBody SMSSendRequest smsSendRequest) {
        smsService.sendSMS(smsSendRequest);
    }
}
