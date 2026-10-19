package tn.esprit.autoloc.autolocapinadinecc18.service;

import tn.esprit.autoloc.autolocapinadinecc18.domain.Paiement;

import java.util.List;

public interface IPaiementService {

    Paiement createPaiement(Paiement paiement);

    Paiement getPaiementById(Long id);

    Paiement updatePaiement(Paiement paiement);

    void deletePaiement(Long id);

    List<Paiement> getAllPaiement();
}