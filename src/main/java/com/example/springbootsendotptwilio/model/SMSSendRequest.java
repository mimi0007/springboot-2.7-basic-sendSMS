package com.example.springbootsendotptwilio.model;

import lombok.NonNull;

public class SMSSendRequest {
    @NonNull
    private String senderPhoneNumber;

    @NonNull
    private String messageBody;

    public SMSSendRequest(@NonNull String senderPhoneNumber, @NonNull String messageBody) {
        this.senderPhoneNumber = senderPhoneNumber;
        this.messageBody = messageBody;
    }

    public String getSenderPhoneNumber() {
        return senderPhoneNumber;
    }

    public void setSenderPhoneNumber(String senderPhoneNumber) {
        this.senderPhoneNumber = senderPhoneNumber;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }
}
