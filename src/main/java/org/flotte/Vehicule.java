package org.flotte;

import lombok.Getter;
import org.flotte.moteur.Moteur;


public abstract class Vehicule {

    @Getter
    private final String matricule;

    @Getter
    private final String modele;

    @Getter
    private final int niveauCarburant;

    @Getter
    private final FuelType energie;

    @Getter
    private final Moteur moteur;

    public Vehicule(String matricule, String modele, int niveauCarburant, FuelType energie, Moteur moteur) {
        this.matricule = matricule;
        this.modele = modele;
        this.niveauCarburant = niveauCarburant;
        this.energie = energie;
        this.moteur = moteur;
    }

    public abstract void demarrer();

    public float obtenirAutonomie() {
        return moteur.autonomieRestante(niveauCarburant);
    }
}
