package tn.esprit.autoloc.autolocapinadinecc18.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapinadinecc18.domain.Equipement;
import tn.esprit.autoloc.autolocapinadinecc18.service.Impis.EquipementServiceImpi;

import java.util.List;

@Tag(name = "Equipements", description = "Ressource equipement")

@RestController
@RequestMapping("equipements")
@RequiredArgsConstructor
public class EquipementRestController {
    private final EquipementServiceImpi equipementServiceImpi;

    @Operation(summary = "ajoute Equipement")
    @PostMapping
    public Equipement createEquipement(@RequestBody Equipement equipement) {
        return equipementServiceImpi.createEquipement(equipement);
    }

    @GetMapping("/{id}")
    public Equipement getEquipementById(@PathVariable Long id) {
        return equipementServiceImpi.getEquipementById(id);
    }

    @PutMapping
    public Equipement updateEquipement(@RequestBody Equipement equipement) {
        return equipementServiceImpi.updateEquipement(equipement);
    }

    @DeleteMapping("/{id}")
    public void deleteEquipement(@PathVariable Long id) {
        equipementServiceImpi.deleteEquipement(id);
    }

    @GetMapping
    public List<Equipement> getAllEquipement() {
        return equipementServiceImpi.getAllEquipement();
    }
}