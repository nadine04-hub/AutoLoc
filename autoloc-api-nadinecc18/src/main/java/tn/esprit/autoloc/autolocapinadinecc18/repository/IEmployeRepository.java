package tn.esprit.autoloc.autolocapinadinecc18.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autolocapinadinecc18.domain.Employe;

public interface IEmployeRepository extends JpaRepository<Employe,Long> {
}
