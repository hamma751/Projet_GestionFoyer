package tn.esprim.gestionfoyer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Reservation implements Serializable {

    @Id
    private String idReservation;

    private Date anneeUniversitaire;

    private boolean estValide;

    @ManyToOne
    private Chambre chambre;

    @ManyToMany
    private List<Etudiant> etudiants;
}
