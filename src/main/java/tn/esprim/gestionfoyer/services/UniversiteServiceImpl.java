package tn.esprim.gestionfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprim.gestionfoyer.entities.Universite;
import tn.esprim.gestionfoyer.repositories.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService {
    @Autowired
    private UniversiteRepository universiteRepository;

    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }
    public Universite retrieveUniversite(Long universiteId) {
        return universiteRepository.findById(universiteId).get();
    }
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }
    public void removeUniversite(Long universiteId) {
        universiteRepository.deleteById(universiteId);
    }
    public Universite modifyUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }
}
