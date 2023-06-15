package com.example.springbootsendotptwilio.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@NoArgsConstructor
@Getter
@Setter
public class TwilioConfig {

    @Value("${AUTH_TOKEN}")
    private String authToken;

    @Value("${ACCOUNT_SID}")
    private String accountSID;

    @Value("${TRIAL_NUMBER}")
    private String trialNumber;
}
