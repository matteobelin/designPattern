package org.station;

import org.station.affichage.AffichageSpecial;
import org.station.affichage.AffichageStandard;

public class Main {
    static void main() {
        AffichageStandard affichage = new AffichageStandard();
        AffichageSpecial affichageSpecial = new AffichageSpecial();
        StationMeteo stationMeteo = new StationMeteo();

        stationMeteo.ajouterObservateur(affichage);
        stationMeteo.ajouterObservateur(affichageSpecial);
        stationMeteo.nouvelleMesure(new Mesure(21,2,1));

        stationMeteo.nouvelleMesure(new Mesure(22,3,1));
    }
}
