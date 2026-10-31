package tn.esprim.gestionfoyer.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;
    @JsonIgnore
    @OneToOne(mappedBy = "foyer")
    private Universite universite;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "foyer")
    private List<Bloc> blocs;
}
