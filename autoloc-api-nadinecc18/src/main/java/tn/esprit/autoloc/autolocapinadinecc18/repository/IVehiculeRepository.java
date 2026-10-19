package tn.esprit.autoloc.autolocapinadinecc18.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.autoloc.autolocapinadinecc18.domain.Vehicule;

public interface IVehiculeRepository extends JpaRepository<Vehicule,Long> {


}
