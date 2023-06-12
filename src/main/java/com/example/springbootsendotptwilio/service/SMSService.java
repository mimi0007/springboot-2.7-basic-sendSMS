package com.example.springbootsendotptwilio.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SMSService {

    public String sendSMS(String receiverPhoneNumber, String messageBody) {

        log.info("Phone Number - {}, messageBody - {}", receiverPhoneNumber, messageBody);

        return "This is the sendSMS Method";
    }

}
