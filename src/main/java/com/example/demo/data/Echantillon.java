package com.example.demo.data;

import org.springframework.stereotype.Service;

// Service => disponible (tjrs)


public class Echantillon {
    public int getNombrebVoiture() {
        return nombrebVoiture;
    }

    public void setNombrebVoiture(int nombrebVoiture) {
        this.nombrebVoiture = nombrebVoiture;
    }

    public double getPrixMoyen() {
        return prixMoyen;
    }

    public void setPrixMoyen(double prixMoyen) {
        this.prixMoyen = prixMoyen;
    }

    public Echantillon(int nombrebVoiture, double prixMoyen) {
        this.nombrebVoiture = nombrebVoiture;
        this.prixMoyen = prixMoyen;
    }
    public Echantillon(){}

    private int nombrebVoiture;
    private double prixMoyen;
}
