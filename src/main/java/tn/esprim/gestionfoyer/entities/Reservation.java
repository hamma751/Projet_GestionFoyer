package tn.esprim.gestionfoyer.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String idReservation;

    private Date anneeUniversitaire;

    private boolean estValide;

    @JsonIgnore
    @ManyToOne
    private Chambre chambre;

    @JsonIgnore
    @ManyToMany
    private List<Etudiant> etudiants;
}
