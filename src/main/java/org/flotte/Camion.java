package org.flotte;


import org.flotte.moteur.Moteur;

public class Camion extends Vehicule{
    public Camion(String matricule, String modele, int niveauCarburant, FuelType energie, Moteur moteur) {
        super(matricule, modele, niveauCarburant, energie,moteur);
    }

    @Override
    public void demarrer() {
        System.out.println("Le camion demarre");
    }

}
