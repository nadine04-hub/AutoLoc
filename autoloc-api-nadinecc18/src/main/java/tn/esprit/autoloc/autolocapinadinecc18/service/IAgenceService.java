package tn.esprit.autoloc.autolocapinadinecc18.service;

import tn.esprit.autoloc.autolocapinadinecc18.domain.Agence;

import java.util.List;

public interface IAgenceService {

    Agence createAgence(Agence agence);

    Agence getAgenceById(Long id);

    Agence updateAgence(Agence agence);

    void deleteAgence(Long id);

    List<Agence> getAllAgence();
}