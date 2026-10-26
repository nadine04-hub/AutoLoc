package tn.esprit.autoloc.autolocapinadinecc18.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapinadinecc18.domain.Paiement;
import tn.esprit.autoloc.autolocapinadinecc18.service.Impis.PaiementServiceImpi;

import java.util.List;

@Tag(name = "Paiements", description = "Ressource paiement")

@RestController
@RequestMapping("paiements")
@RequiredArgsConstructor
public class PaiementRestController {
    private final PaiementServiceImpi paiementServiceImpi;

    @Operation(summary = "ajoute Paiement")
    @PostMapping
    public Paiement createPaiement(@RequestBody Paiement paiement) {
        return paiementServiceImpi.createPaiement(paiement);
    }

    @GetMapping("/{id}")
    public Paiement getPaiementById(@PathVariable Long id) {
        return paiementServiceImpi.getPaiementById(id);
    }

    @PutMapping
    public Paiement updatePaiement(@RequestBody Paiement paiement) {
        return paiementServiceImpi.updatePaiement(paiement);
    }

    @DeleteMapping("/{id}")
    public void deletePaiement(@PathVariable Long id) {
        paiementServiceImpi.deletePaiement(id);
    }

    @GetMapping
    public List<Paiement> getAllPaiement() {
        return paiementServiceImpi.getAllPaiement();
    }
}