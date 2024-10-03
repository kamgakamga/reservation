package com.smartcom.reservations.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Entity
@AllArgsConstructor @NoArgsConstructor @Data @Builder
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;
    private String  title;
    private double  price;
    @Enumerated(EnumType.STRING)
    private ReservationStatus  status;
}
