package tn.esprit.autoloc.autolocapinadinecc18.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapinadinecc18.domain.Vehicule;
import tn.esprit.autoloc.autolocapinadinecc18.service.Impis.VehiculeServiceImpi;

import java.util.List;
@Tag(name = "Vehicules" ,description = "Ressource vehicule")

@RestController
@RequestMapping("vehicules")
@RequiredArgsConstructor
public class VehiculeRestController{
    private final VehiculeServiceImpi vehiculeServiceImpi;
    @Operation(summary = "ajoute Vehicule")
    @PostMapping
    public Vehicule createVehicule(@RequestBody Vehicule vehicule){
        return vehiculeServiceImpi.createVehicule(vehicule);
    }
    @GetMapping("/{id}")
    public Vehicule getVehiculeById(@PathVariable Long id){
        return vehiculeServiceImpi.getVehiculeById(id);
    }
    @PutMapping
    public Vehicule updateVehicule(@RequestBody Vehicule vehicule){
        return vehiculeServiceImpi.updateVehicule(vehicule);
    }
    @DeleteMapping("/{id}")
    public void deleteVehicule(@PathVariable Long id){
        vehiculeServiceImpi.deleteVehicule(id);
    }
    @GetMapping
    public List<Vehicule> getAllVehicule(){
        return vehiculeServiceImpi.getAllVehicule();
    }


}
