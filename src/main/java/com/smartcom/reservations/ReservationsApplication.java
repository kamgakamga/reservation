package com.smartcom.reservations;

import com.smartcom.reservations.entities.Reservation;
import com.smartcom.reservations.entities.ReservationStatus;
import com.smartcom.reservations.repository.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReservationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReservationsApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner (ReservationRepository reservationRepository){
        return args -> {
            reservationRepository.save(Reservation.builder().title("Reservation 1").price(60000).status(ReservationStatus.VALIDATION).build());
            reservationRepository.save(Reservation.builder().title("Reservation 2").price(40000).status(ReservationStatus.CANCEL).build());
            reservationRepository.save(Reservation.builder().title("Reservation 3").price(10000).status(ReservationStatus.PENDING).build());

        };
    }
}
