package com.kyunghunlee.studentmanagementsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@RestController
//@ControllerAdvice 를 선언해두면 모든 컨트롤러가 실행될 때
//ControllerAdvice를 가진 BEAN을 거쳐감, 모든 예외 상황이 발생할
@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler {

    // 모든 예외를 처리하는 예외 처리
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
        ExceptionResponse exceptionResponse =
                new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));

        return new ResponseEntity(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }


}