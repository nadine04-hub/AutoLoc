package tn.esprit.autoloc.autolocapinadinecc18.service;

import tn.esprit.autoloc.autolocapinadinecc18.domain.Employe;

import java.util.List;

public interface IEmployeService {

    Employe createEmploye(Employe employe);

    Employe getEmployeById(Long id);

    Employe updateEmploye(Employe employe);

    void deleteEmploye(Long id);

    List<Employe> getAllEmploye();
}