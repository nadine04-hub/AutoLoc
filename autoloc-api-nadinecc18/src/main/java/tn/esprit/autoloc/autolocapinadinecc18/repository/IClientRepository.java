package tn.esprit.autoloc.autolocapinadinecc18.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autolocapinadinecc18.domain.Client;

public interface IClientRepository extends JpaRepository<Client,Long> {
}
