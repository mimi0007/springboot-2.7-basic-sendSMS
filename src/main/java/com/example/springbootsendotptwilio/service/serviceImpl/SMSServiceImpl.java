package com.example.springbootsendotptwilio.service.serviceImpl;

import com.example.springbootsendotptwilio.config.TwilioConfig;
import com.example.springbootsendotptwilio.model.SMSSendRequest;
import com.example.springbootsendotptwilio.service.SMSService;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import org.springframework.stereotype.Service;

@Service
public class SMSServiceImpl implements SMSService {

    private final TwilioConfig twilioConfig;

    public SMSServiceImpl(TwilioConfig twilioConfig) {
        this.twilioConfig = twilioConfig;
    }

    @Override
    public void sendSMS(SMSSendRequest smsSendRequest) {
        PhoneNumber fromPhoneNumber = new PhoneNumber(twilioConfig.getTrialNumber());
        String messageBody = smsSendRequest.getMessageBody();
        PhoneNumber toPhoneNumber = new PhoneNumber(""); //twilio verified number

        MessageCreator creator = Message.creator(toPhoneNumber, fromPhoneNumber, messageBody);
        creator.create();

    }
}
