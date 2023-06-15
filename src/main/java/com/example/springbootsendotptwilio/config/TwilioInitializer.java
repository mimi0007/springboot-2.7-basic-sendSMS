package com.example.springbootsendotptwilio.config;

import com.twilio.Twilio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class TwilioInitializer {

    @Autowired
    public TwilioInitializer(TwilioConfig twilioConfig) {
        Twilio.init(twilioConfig.getAccountSID(), twilioConfig.getAuthToken());
    }
}
