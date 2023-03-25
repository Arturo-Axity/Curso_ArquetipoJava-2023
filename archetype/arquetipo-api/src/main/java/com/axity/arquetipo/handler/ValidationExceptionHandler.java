package com.axity.arquetipo.handler;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.axity.arquetipo.commons.enums.ErrorCode;
import com.axity.arquetipo.commons.response.HeaderDto;

/**
 * @author guillermo.segura@axity.com
 */
@ControllerAdvice
public class ValidationExceptionHandler extends ResponseEntityExceptionHandler
{
  @Value("${arquetipo.error.1}")
  private String message;

  /**
   * {@inheritDoc}
   */
  @Override
  protected ResponseEntity<Object> handleMethodArgumentNotValid( MethodArgumentNotValidException ex,
      HttpHeaders headers, HttpStatus status, WebRequest request )
  {
    List<String> errors = ex.getBindingResult().getFieldErrors().stream().map( FieldError::getDefaultMessage )
        .collect( Collectors.toList() );

    var body = new HeaderDto( ErrorCode.REQUIRED_FIELD.getCode(), message );
    body.setDetail( String.join( ",", errors ) );

    return new ResponseEntity<>( body, headers, status );

  }
}
