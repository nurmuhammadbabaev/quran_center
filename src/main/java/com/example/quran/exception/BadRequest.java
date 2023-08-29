package com.example.quran.exception;

public class BadRequest extends RuntimeException{
    public BadRequest() {
    }

    public BadRequest(String message) {
        super(message);
    }
}
