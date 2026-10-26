package tn.esprit.autoloc.autolocapinadinecc18.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapinadinecc18.domain.Agence;
import tn.esprit.autoloc.autolocapinadinecc18.service.Impis.AgenceServiceImpi;

import java.util.List;

@Tag(name = "Agences", description = "Ressource agence")

@RestController
@RequestMapping("agences")
@RequiredArgsConstructor
public class AgenceRestController {
    private final AgenceServiceImpi agenceServiceImpi;

    @Operation(summary = "ajoute Agence")
    @PostMapping
    public Agence createAgence(@RequestBody Agence agence) {
        return agenceServiceImpi.createAgence(agence);
    }

    @GetMapping("/{id}")
    public Agence getAgenceById(@PathVariable Long id) {
        return agenceServiceImpi.getAgenceById(id);
    }

    @PutMapping
    public Agence updateAgence(@RequestBody Agence agence) {
        return agenceServiceImpi.updateAgence(agence);
    }

    @DeleteMapping("/{id}")
    public void deleteAgence(@PathVariable Long id) {
        agenceServiceImpi.deleteAgence(id);
    }

    @GetMapping
    public List<Agence> getAllAgence() {
        return agenceServiceImpi.getAllAgence();
    }
}