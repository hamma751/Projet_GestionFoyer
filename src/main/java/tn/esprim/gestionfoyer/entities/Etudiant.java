package tn.esprim.gestionfoyer.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;

    private String nom;

    private String prenom;

    private long cin;

    private String ecole;

    @JsonFormat(pattern = "yyyy/MM/dd")

    private Date dateNaissance;

    @ManyToMany(mappedBy = "etudiants")
    private List<Reservation> reservations;
}
