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
    void uneVoiture(){
        Voiture v = new Voiture("Fiat", 40000);
        when(voitureRepository.save(v)).thenReturn(v);
        voitureRepository.save(v);
        Voiture voitureRecuperee = (Voiture) voitureRepository.findById(0);
        Assert.isTrue(v.equals(voitureRecuperee), "La voiture récupérée n'est pas la même que celle créée");
        voitureRepository.deleteById(voitureRecuperee.getId());
        voitureRecuperee = voitureRepository.findById(0);
        Assert.isTrue(v != voitureRecuperee, "La voiture existe toujours dans la BDD");
    }
}