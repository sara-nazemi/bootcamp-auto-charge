package com.example.bootcampautocharge.exceptions;

public class AutoChargeException extends RuntimeException{
    public AutoChargeException() {
    }

    public AutoChargeException(String message) {
        super(message);
    }

    public AutoChargeException(String message, Throwable cause) {
        super(message, cause);
    }

    public AutoChargeException(Throwable cause) {
        super(cause);
    }

    public AutoChargeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
