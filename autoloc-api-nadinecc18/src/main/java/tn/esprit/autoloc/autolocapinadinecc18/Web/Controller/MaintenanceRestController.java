package tn.esprit.autoloc.autolocapinadinecc18.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapinadinecc18.domain.Maintenance;
import tn.esprit.autoloc.autolocapinadinecc18.service.Impis.MaintenanceServiceImpi;

import java.util.List;

@Tag(name = "Maintenances", description = "Ressource maintenance")

@RestController
@RequestMapping("maintenances")
@RequiredArgsConstructor
public class MaintenanceRestController {
    private final MaintenanceServiceImpi maintenanceServiceImpi;

    @Operation(summary = "ajoute Maintenance")
    @PostMapping
    public Maintenance createMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceServiceImpi.createMaintenance(maintenance);
    }

    @GetMapping("/{id}")
    public Maintenance getMaintenanceById(@PathVariable Long id) {
        return maintenanceServiceImpi.getMaintenanceById(id);
    }

    @PutMapping
    public Maintenance updateMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceServiceImpi.updateMaintenance(maintenance);
    }

    @DeleteMapping("/{id}")
    public void deleteMaintenance(@PathVariable Long id) {
        maintenanceServiceImpi.deleteMaintenance(id);
    }

    @GetMapping
    public List<Maintenance> getAllMaintenance() {
        return maintenanceServiceImpi.getAllMaintenance();
    }
}