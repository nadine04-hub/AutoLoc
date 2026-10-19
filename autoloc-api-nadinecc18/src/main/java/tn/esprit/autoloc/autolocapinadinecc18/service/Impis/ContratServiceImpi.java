package tn.esprit.autoloc.autolocapinadinecc18.service.Impis;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapinadinecc18.domain.Contrat;
import tn.esprit.autoloc.autolocapinadinecc18.repository.IContratRepository;
import tn.esprit.autoloc.autolocapinadinecc18.service.IContratService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContratServiceImpi implements IContratService {

    private final IContratRepository contratRepository;

    @Override
    public Contrat createContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat getContratById(Long id) {
        return contratRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Contrat introuvable avec l'id " + id));
    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public void deleteContrat(Long id) {
        contratRepository.deleteById(id);
    }

    @Override
    public List<Contrat> getAllContrat() {
        return contratRepository.findAll();
    }
}