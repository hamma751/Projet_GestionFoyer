package tn.esprim.gestionfoyer.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Bloc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc;

    private String nomBloc;

    private long capaciteBloc;
    @ManyToOne
    private Foyer foyer;

    @JsonIgnore
    @OneToMany(mappedBy = "bloc")
    private List<Chambre> chambres;
}
