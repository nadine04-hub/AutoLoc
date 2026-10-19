package tn.esprit.autoloc.autolocapinadinecc18.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autolocapinadinecc18.domain.Reservation;


public interface IReservationRepository extends JpaRepository<Reservation, Long> {
}