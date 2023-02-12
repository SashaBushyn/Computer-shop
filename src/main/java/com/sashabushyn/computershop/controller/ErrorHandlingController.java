package com.sashabushyn.computershop.controller;

import com.sashabushyn.computershop.model.Exceptions.Error;
import com.sashabushyn.computershop.model.Exceptions.ServiceException;
import com.sashabushyn.computershop.model.enams.ErrorType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.HandlerMethod;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ErrorHandlingController {

    @ExceptionHandler(ServiceException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Error handleServiceException(ServiceException exception, HandlerMethod handlerMethod) {
        return new Error(exception.getMessage(), exception.getErrorType(), LocalDateTime.now());
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Error handleException(Exception exception, HandlerMethod handlerMethod) {
        return new Error(exception.getMessage(), ErrorType.PROCESSING_ERROR_TYPE, LocalDateTime.now());
    }
}
