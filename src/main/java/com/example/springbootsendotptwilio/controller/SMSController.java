package com.example.springbootsendotptwilio.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SMSController {

    @PostMapping("/mobileNo")
    public String sendOtp() {
        return "Otp is sent successfully!";
    }
}
