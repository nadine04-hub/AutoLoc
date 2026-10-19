package tn.esprit.autoloc.autolocapinadinecc18.service;

import tn.esprit.autoloc.autolocapinadinecc18.domain.Contrat;

import java.util.List;

public interface IContratService {

    Contrat createContrat(Contrat contrat);

    Contrat getContratById(Long id);

    Contrat updateContrat(Contrat contrat);

    void deleteContrat(Long id);

    List<Contrat> getAllContrat();
}