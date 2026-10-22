package tn.esprim.gestionfoyer.repositories;

import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprim.gestionfoyer.entities.Etudiant;

import java.util.Date;
import java.util.List;

@Registered
public interface EtudiantRepository extends JpaRepository<Etudiant,String> {
    List<Etudiant> findByDateNaissanceBetween(Date dFrom, Date dTo);
}
