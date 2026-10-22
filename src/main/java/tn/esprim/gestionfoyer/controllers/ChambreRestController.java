package tn.esprim.gestionfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import tn.esprim.gestionfoyer.repositories.ChambreRepository;

@Controller
public class ChambreRestController {
    @Autowired
    private ChambreRepository chambreRepository;
}
