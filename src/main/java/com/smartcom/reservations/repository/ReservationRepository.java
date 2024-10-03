package com.smartcom.reservations.repository;

import com.smartcom.reservations.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
