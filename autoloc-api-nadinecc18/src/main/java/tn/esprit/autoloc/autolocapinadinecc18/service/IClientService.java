package tn.esprit.autoloc.autolocapinadinecc18.service;

import tn.esprit.autoloc.autolocapinadinecc18.domain.Client;

import java.util.List;

public interface IClientService {

    Client createClient(Client client);

    Client getClientById(Long id);

    Client updateClient(Client client);

    void deleteClient(Long id);

    List<Client> getAllClient();
}