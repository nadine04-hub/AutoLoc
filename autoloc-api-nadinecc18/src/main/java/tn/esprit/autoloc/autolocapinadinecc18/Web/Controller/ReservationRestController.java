package tn.esprit.autoloc.autolocapinadinecc18.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapinadinecc18.domain.Reservation;
import tn.esprit.autoloc.autolocapinadinecc18.service.Impis.ReservationServiceImpi;

import java.util.List;

@Tag(name = "Reservations", description = "Ressource reservation")

@RestController
@RequestMapping("reservations")
@RequiredArgsConstructor
public class ReservationRestController {
    private final ReservationServiceImpi reservationServiceImpi;

    @Operation(summary = "ajoute Reservation")
    @PostMapping
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return reservationServiceImpi.createReservation(reservation);
    }

    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable Long id) {
        return reservationServiceImpi.getReservationById(id);
    }

    @PutMapping
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationServiceImpi.updateReservation(reservation);
    }

    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationServiceImpi.deleteReservation(id);
    }

    @GetMapping
    public List<Reservation> getAllReservation() {
        return reservationServiceImpi.getAllReservation();
    }
}