package tn.esprit.autoloc.autolocapinadinecc18.service.Impis;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapinadinecc18.domain.Employe;
import tn.esprit.autoloc.autolocapinadinecc18.repository.IEmployeRepository;
import tn.esprit.autoloc.autolocapinadinecc18.service.IEmployeService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeServiceImpi implements IEmployeService {

    private final IEmployeRepository employeRepository;

    @Override
    public Employe createEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe getEmployeById(Long id) {
        return employeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Employe introuvable avec l'id " + id));
    }

    @Override
    public Employe updateEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public void deleteEmploye(Long id) {
        employeRepository.deleteById(id);
    }

    @Override
    public List<Employe> getAllEmploye() {
        return employeRepository.findAll();
    }
}