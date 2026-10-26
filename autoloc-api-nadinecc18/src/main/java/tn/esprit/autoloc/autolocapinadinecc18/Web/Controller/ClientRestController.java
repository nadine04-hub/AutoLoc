package tn.esprit.autoloc.autolocapinadinecc18.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapinadinecc18.domain.Client;
import tn.esprit.autoloc.autolocapinadinecc18.service.Impis.ClientServiceImpi;

import java.util.List;

@Tag(name = "Clients", description = "Ressource client")

@RestController
@RequestMapping("clients")
@RequiredArgsConstructor
public class ClientRestController {
    private final ClientServiceImpi clientServiceImpi;

    @Operation(summary = "ajoute Client")
    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientServiceImpi.createClient(client);
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientServiceImpi.getClientById(id);
    }

    @PutMapping
    public Client updateClient(@RequestBody Client client) {
        return clientServiceImpi.updateClient(client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientServiceImpi.deleteClient(id);
    }

    @GetMapping
    public List<Client> getAllClient() {
        return clientServiceImpi.getAllClient();
    }
}