package com.dhome.registermicroservice.contracts.events;

import lombok.Value;

import java.time.Instant;

@Value
public class AccountOpened {
    private String accountId;
    private String username;
    private String password;
    private boolean verify;
    private Instant occuredOn;
}
