package com.example.salonapi.repository;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.*;




import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@ToString
@Getter
public class Slot {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToMany(fetch = FetchType.EAGER)
  @JsonIgnore
  Set<SalonServiceDetail> availableServices;


  @ManyToOne
  private SalonServiceDetail selectedService;

  String stylistName;


  LocalDateTime slotFor;

  private SlotStatus status;

  LocalDateTime lockedAt;
  LocalDateTime confirmedAt;


}

enum  SlotStatus {
  AVAILABLE,LOCKED,CONFIRMED,CANCELLED
}
