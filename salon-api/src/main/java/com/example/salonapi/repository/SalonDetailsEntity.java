package com.example.salonapi.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@Entity
public class SalonDetailsEntity {
  @Value("${name}")
  private String name;
  @Value("${address}")
  private String address;
  @Value("${city}")
  private String city;
  @Value("${state}")
  private String state;
  @Value("${zipCode}")
  private String zipCode;
  @Value("${phone}")
  private String phone;
  @Setter
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

}
