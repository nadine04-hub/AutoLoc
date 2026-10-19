package tn.esprit.autoloc.autolocapinadinecc18.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autolocapinadinecc18.domain.Equipement;

public interface IEquipementRepository extends JpaRepository<Equipement, Long> {
}