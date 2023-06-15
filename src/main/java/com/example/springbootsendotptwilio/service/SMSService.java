package com.example.springbootsendotptwilio.service;

import com.example.springbootsendotptwilio.model.SMSSendRequest;

public interface SMSService {

    void sendSMS(SMSSendRequest smsSendRequest);

}
