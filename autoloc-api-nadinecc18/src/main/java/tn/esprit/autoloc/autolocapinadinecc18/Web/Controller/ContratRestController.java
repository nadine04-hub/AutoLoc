package tn.esprit.autoloc.autolocapinadinecc18.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapinadinecc18.domain.Contrat;
import tn.esprit.autoloc.autolocapinadinecc18.service.Impis.ContratServiceImpi;

import java.util.List;

@Tag(name = "Contrats", description = "Ressource contrat")

@RestController
@RequestMapping("contrats")
@RequiredArgsConstructor
public class ContratRestController {
    private final ContratServiceImpi contratServiceImpi;

    @Operation(summary = "ajoute Contrat")
    @PostMapping
    public Contrat createContrat(@RequestBody Contrat contrat) {
        return contratServiceImpi.createContrat(contrat);
    }

    @GetMapping("/{id}")
    public Contrat getContratById(@PathVariable Long id) {
        return contratServiceImpi.getContratById(id);
    }

    @PutMapping
    public Contrat updateContrat(@RequestBody Contrat contrat) {
        return contratServiceImpi.updateContrat(contrat);
    }

    @DeleteMapping("/{id}")
    public void deleteContrat(@PathVariable Long id) {
        contratServiceImpi.deleteContrat(id);
    }

    @GetMapping
    public List<Contrat> getAllContrat() {
        return contratServiceImpi.getAllContrat();
    }
}