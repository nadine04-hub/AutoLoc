package tn.esprit.autoloc.autolocapinadinecc18.service.Impis;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapinadinecc18.domain.Agence;
import tn.esprit.autoloc.autolocapinadinecc18.repository.IAgenceRepository;
import tn.esprit.autoloc.autolocapinadinecc18.service.IAgenceService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgenceServiceImpi implements IAgenceService {

    private final IAgenceRepository agenceRepository;

    @Override
    public Agence createAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence getAgenceById(Long id) {
        return agenceRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Agence introuvable avec l'id " + id));
    }

    @Override
    public Agence updateAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void deleteAgence(Long id) {
        agenceRepository.deleteById(id);
    }

    @Override
    public List<Agence> getAllAgence() {
        return agenceRepository.findAll();
    }
}