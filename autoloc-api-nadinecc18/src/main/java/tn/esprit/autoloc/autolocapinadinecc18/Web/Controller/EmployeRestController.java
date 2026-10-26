package tn.esprit.autoloc.autolocapinadinecc18.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapinadinecc18.domain.Employe;
import tn.esprit.autoloc.autolocapinadinecc18.service.Impis.EmployeServiceImpi;

import java.util.List;

@Tag(name = "Employes", description = "Ressource employe")

@RestController
@RequestMapping("employes")
@RequiredArgsConstructor
public class EmployeRestController {
    private final EmployeServiceImpi employeServiceImpi;

    @Operation(summary = "ajoute Employe")
    @PostMapping
    public Employe createEmploye(@RequestBody Employe employe) {
        return employeServiceImpi.createEmploye(employe);
    }

    @GetMapping("/{id}")
    public Employe getEmployeById(@PathVariable Long id) {
        return employeServiceImpi.getEmployeById(id);
    }

    @PutMapping
    public Employe updateEmploye(@RequestBody Employe employe) {
        return employeServiceImpi.updateEmploye(employe);
    }

    @DeleteMapping("/{id}")
    public void deleteEmploye(@PathVariable Long id) {
        employeServiceImpi.deleteEmploye(id);
    }

    @GetMapping
    public List<Employe> getAllEmploye() {
        return employeServiceImpi.getAllEmploye();
    }
}