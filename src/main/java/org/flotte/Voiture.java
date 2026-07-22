package org.flotte;

import org.flotte.moteur.Moteur;

public class Voiture extends Vehicule{
    public Voiture(String matricule, String modele, int niveauCarburant, FuelType energie, Moteur moteur) {
        super(matricule, modele, niveauCarburant, energie, moteur);
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture demarre");
    }
}
