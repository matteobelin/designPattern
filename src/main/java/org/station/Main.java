package org.station;

import org.station.affichage.AffichageSpecial;
import org.station.affichage.AffichageStandard;

public class Main {
    static void main() {
        StationMeteo stationMeteo = new StationMeteo();
        new AffichageStandard(stationMeteo);
        new AffichageSpecial(stationMeteo);
        stationMeteo.nouvelleMesure(new Mesure(21,2,1));

        stationMeteo.nouvelleMesure(new Mesure(22,3,1));
    }
}
