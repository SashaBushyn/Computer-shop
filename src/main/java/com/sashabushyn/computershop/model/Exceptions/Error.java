package com.sashabushyn.computershop.model.Exceptions;

import com.sashabushyn.computershop.model.enams.ErrorType;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Error {
    private String message;
    private ErrorType errorType;
    private LocalDateTime timeStamp;
}
