package tn.esprit.autoloc.autolocapinadinecc18.service;

import tn.esprit.autoloc.autolocapinadinecc18.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule createVehicule(Vehicule vehicule);
    Vehicule getVehiculeById(Long id);
    Vehicule updateVehicule(Vehicule vehicule);
    void deleteVehicule(Long id );
    List<Vehicule> getAllVehicule();
}
