package com.example.myauthenticationserver.error;

import lombok.Getter;
import lombok.NonNull;

import java.sql.Timestamp;
import java.time.Instant;

@Getter
public abstract class CustomException extends RuntimeException{

    private final Timestamp timestamp;

    private final int code;

    private final String detail;


    public CustomException(final int code, @NonNull final String detail){
        super(detail);
        this.timestamp = Timestamp.from(Instant.now());
        this.code = code;
        this.detail = detail;
    }
}
