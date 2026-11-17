// TODO(reto): archivo stubbeado; implementa los cuerpos.
package com.example.reto.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    // TODO(reto): Implementar manejadores de excepciones para los siguientes casos:
    // - IllegalArgumentException: retornar 400 Bad Request con mensaje de error
    // - NoSuchElementException (orden no encontrada): retornar 404 Not Found
    // - Exception genérica: retornar 500 Internal Server Error
    
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, Object>> handleIllegalArgumentException(IllegalArgumentException ex) {
        // TODO(reto): Retornar ResponseEntity con estado 400 y cuerpo con:
        // - timestamp: fecha y hora actual
        // - status: 400
        // - error: "Bad Request"
        // - message: el mensaje de la excepción
        return null;
    }

    @ExceptionHandler(java.util.NoSuchElementException.class)
    public ResponseEntity<Map<String, Object>> handleNoSuchElementException(java.util.NoSuchElementException ex) {
        // TODO(reto): Retornar ResponseEntity con estado 404 y cuerpo con:
        // - timestamp: fecha y hora actual
        // - status: 404
        // - error: "Not Found"
        // - message: el mensaje de la excepción
        return null;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>> handleGenericException(Exception ex) {
        // TODO(reto): Retornar ResponseEntity con estado 500 y cuerpo con:
        // - timestamp: fecha y hora actual
        // - status: 500
        // - error: "Internal Server Error"
        // - message: mensaje genérico ("An unexpected error occurred")
        return null;
    }

    private Map<String, Object> createErrorBody(HttpStatus status, String message) {
      throw new UnsupportedOperationException("TODO(reto): createErrorBody");
    }
}