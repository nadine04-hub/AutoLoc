package tn.esprit.autoloc.autolocapinadinecc18.service.Impis;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapinadinecc18.domain.Client;
import tn.esprit.autoloc.autolocapinadinecc18.repository.IClientRepository;
import tn.esprit.autoloc.autolocapinadinecc18.service.IClientService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpi implements IClientService {

    private final IClientRepository clientRepository;

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Client introuvable avec l'id " + id));
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public List<Client> getAllClient() {
        return clientRepository.findAll();
    }
}