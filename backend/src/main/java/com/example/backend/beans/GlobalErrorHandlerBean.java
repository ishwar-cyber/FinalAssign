package com.example.backend.beans;

import com.example.backend.exception.ExceptionNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalErrorHandlerBean {
  @ExceptionHandler({ExceptionNotFound.class})
    public ResponseEntity<Object> exceptionHandler(ExceptionNotFound exceptionNotFound){
         return GlobalResponseHandlerBeans.createResponse(exceptionNotFound.getMessage(), HttpStatus.NOT_FOUND);
    }
}
