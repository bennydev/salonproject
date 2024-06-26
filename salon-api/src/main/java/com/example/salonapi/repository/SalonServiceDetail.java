package com.example.salonapi.repository;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@Data
@NoArgsConstructor
@ToString
public class SalonServiceDetail {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;


  String name;
  String description;
  Long price;
  Integer timeInMinutes;
}
