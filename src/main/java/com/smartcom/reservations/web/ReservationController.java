package com.smartcom.reservations.web;

import com.smartcom.reservations.entities.Reservation;
import com.smartcom.reservations.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationController {

    private  final ReservationRepository reservationRepository;

    @GetMapping("/reservation")
    public List<Reservation> listReservations (){

        return  reservationRepository.findAll();
    }
}
