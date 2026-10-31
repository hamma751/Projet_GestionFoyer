package tn.esprim.gestionfoyer.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
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

    @JsonIgnore
    @ManyToMany(mappedBy = "etudiants")
    private List<Reservation> reservations;
}
