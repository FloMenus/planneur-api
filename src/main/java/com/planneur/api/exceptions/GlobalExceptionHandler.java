package com.planneur.api.exceptions;

import com.planneur.api.exceptions.auth.AuthNotFoundException;
import com.planneur.api.exceptions.auth.AuthWrongPasswordException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    //Auth exceptions
    @ExceptionHandler(AuthNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Error> handleAuthNotFoundException(AuthNotFoundException ex) {
        Error error = new Error("Cant find user with email");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

    @ExceptionHandler(AuthWrongPasswordException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ResponseEntity<Error> handleAuthWrongPasswordException(AuthWrongPasswordException ex) {
        Error error = new Error("Wrong password");
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(error);
    }
}
