package org.station.affichage;

import org.station.Mesure;
import org.station.Observable;
import org.station.Observateur;

public class AffichageStandard implements Observateur {

    public AffichageStandard(Observable observable){
        observable.ajouterObservateur(this);
    }

    @Override
    public void actualiser(Mesure mesure) {
        System.out.println("\nAffichage Standard\nNouvelle mesure : \n\tTempérature : " + mesure.getTemperature()
                +"\n\tHumidité : " + mesure.getHumidite() + "\n\tPression : " + mesure.getPression());
    }
}
