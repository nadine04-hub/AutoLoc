package tn.esprit.autoloc.autolocapinadinecc18.service.Impis;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapinadinecc18.domain.Vehicule;
import tn.esprit.autoloc.autolocapinadinecc18.repository.IVehiculeRepository;
import tn.esprit.autoloc.autolocapinadinecc18.service.IVehiculeService;

import java.util.List;
@RequiredArgsConstructor
@Service

public class VehiculeServiceImpi implements IVehiculeService {


    private final IVehiculeRepository vehiculeRepository ;
    @Override
    public Vehicule createVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule getVehiculeById(Long id) {
        return vehiculeRepository.findById(id).orElse(null);
    }

    @Override
    public Vehicule updateVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void deleteVehicule(Long id) {
        vehiculeRepository.deleteById(id);

    }

    @Override
    public List<Vehicule> getAllVehicule() {
        return vehiculeRepository.findAll();
    }
}
