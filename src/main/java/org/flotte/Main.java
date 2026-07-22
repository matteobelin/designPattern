package org.flotte;

import org.flotte.moteur.MoteurDiesel;
import org.flotte.moteur.MoteurElectrique;

import java.util.List;

public class Main {

    private static final MoteurElectrique moteurElectrique = new MoteurElectrique();
    private static final MoteurDiesel moteurDiesel = new MoteurDiesel();

    static void main(String[] args) {
        Voiture voiture = new Voiture("mat","modele",30,FuelType.ELECTRIC, moteurElectrique);
        Camion camion = new Camion("mat","modele",30,FuelType.DIESEL, moteurDiesel);

        List<Vehicule> flotte = List.of(voiture,camion);
        flotte.forEach(v ->{
                    v.demarrer();
                    System.out.println("Autonomie restante " + v.getClass().getSimpleName() + " : " + v.obtenirAutonomie());
                }
        );
    }

}
