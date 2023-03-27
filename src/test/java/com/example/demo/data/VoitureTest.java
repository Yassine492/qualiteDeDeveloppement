package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {

    @Test
    public void voitureSansParametres() {
        Voiture voiture = new Voiture();
        Assert.isNull(voiture.getId());
    }

    @Test
    public void voitureAvecParametres() {
        Voiture voiture = new Voiture("Ford", 20000);
        Assert.notNull(voiture);
        Assert.isTrue("Ford" == voiture.getMarque(), "pas de marque");
        Assert.isTrue(20000 == voiture.getPrix(), "pas de prix");
    }

    @Test
    public void testGetMarque() {
        Voiture voiture = new Voiture("Renault", 15000);
        Assert.isTrue("Renault" == voiture.getMarque(), "getter non fonctionnel");
    }

    @Test
    public void testSetMarque() {
        Voiture voiture = new Voiture("Audi", 35000);
        voiture.setMarque("Mercedes");
        Assert.isTrue("Mercedes" == voiture.getMarque(), "setter non fonctionnel");
    }

    @Test
    public void testGetPrix() {
        Voiture voiture = new Voiture("Peugeot", 18000);
        Assert.isTrue(18000 == voiture.getPrix(), "getter non fonctionnel");
    }

    @Test
    public void testSetPrix() {
        Voiture voiture = new Voiture("Fiat", 12000);
        voiture.setPrix(14000);
        Assert.isTrue(14000 == voiture.getPrix(), "setter non fonctionnel");
    }
}