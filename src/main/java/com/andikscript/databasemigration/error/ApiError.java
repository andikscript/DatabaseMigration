package com.andikscript.databasemigration.error;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class ApiError {

    private HttpStatus http_status;

    private LocalDateTime timestamp;

    private String message;

    private String details;

    public ApiError(HttpStatus http_status, LocalDateTime timestamp, String message, String details) {
        this.http_status = http_status;
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public HttpStatus getHttp_status() {
        return http_status;
    }

    public void setHttp_status(HttpStatus http_status) {
        this.http_status = http_status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
