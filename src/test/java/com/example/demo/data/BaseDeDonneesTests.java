package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.util.Assert;

import java.util.Collections;
import java.util.Iterator;
import java.util.Optional;


import static org.mockito.Mockito.when;

@SpringBootTest
public class BaseDeDonneesTests {

    @MockBean
    private VoitureRepository voitureRepository;

    @Test
    void testCreate() {
        // Créer un nouvel objet voiture
        Voiture voiture = new Voiture("Toyota", 10);

        // Définir le comportement du mock voitureRepository lorsque save() est appelé
        when(voitureRepository.save(voiture)).thenReturn(voiture);

        // Appeler la méthode create de voitureRepository
        Voiture savedVoiture = voitureRepository.save(voiture);

        // Vérifier que l'objet voiture enregistré est égal à l'objet voiture d'origine
        Assert.isTrue(voiture.equals(savedVoiture), "la voiture n'a pas été créée");
        System.out.println(voitureRepository.count());
    }
}

/*
* Voiture v = new Voiture("Fiat", 40000);
        when(voitureRepository.save(v)).;
        voitureRepository.save(v);
        // Test de save()
        System.out.println(voitureRepository.count()+3);
        //Assert.isTrue(voitureRepository.count() == 1, "La voiture n'a pas ete enregistree");
* when(voitureRepository.save(v)).thenReturn(v);
        voitureRepository.save(v);
        Voiture voitureRecuperee = (Voiture) voitureRepository.findById(0);
        Assert.isTrue(v.equals(voitureRecuperee), "La voiture récupérée n'est pas la même que celle créée");
        voitureRepository.deleteById(voitureRecuperee.getId());
        voitureRecuperee = voitureRepository.findById(0);
        Assert.isTrue(v != voitureRecuperee, "La voiture existe toujours dans la BDD");
* */