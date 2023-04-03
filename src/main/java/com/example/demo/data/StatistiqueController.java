package com.example.demo.data;

import com.example.demo.data.Statistique;
import com.example.demo.data.VoitureRepository;
import com.example.demo.data.Echantillon;
import com.example.demo.data.Statistique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatistiqueController {
    @Autowired
    private Statistique statistique;

    @Autowired
    private VoitureRepository voitureRepository;

    @GetMapping(value = "/statistique")
    public Echantillon getStatistiques(){
        return statistique.prixMoyen();
    }

    @PostMapping("/ajouter")
    public void ajouterVoiture(@RequestBody Voiture v){
        statistique.ajouter(v);
    }
}