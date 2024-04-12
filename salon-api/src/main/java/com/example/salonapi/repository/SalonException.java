package com.example.salonapi.repository;

public class SalonException extends RuntimeException {
  public SalonException(String message) {
    super(message);
  }

  public SalonException(String message, Throwable cause) {
    super(message, cause);
  }
}
