package org.station.affichage;

import org.station.Mesure;
import org.station.Observateur;

public class AffichageStandard implements Observateur {
    @Override
    public void actualiser(Mesure mesure) {
        System.out.println("\nAffichage Standard\nNouvelle mesure : \n\tTempérature : " + mesure.getTemperature()
                +"\n\tHumidité : " + mesure.getHumidite() + "\n\tPression : " + mesure.getPression());
    }
}
