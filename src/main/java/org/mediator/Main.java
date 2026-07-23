package org.mediator;

public class Main {
    static void main() {
        ATCMediator tower = new ControlTower();

        Airplane avion1 = new CommercialAirplane(tower, "AF-123");
        Airplane avion2 = new CommercialAirplane(tower, "LH-456");
        Airplane avion3 = new CargoAirplane(tower, "CG-789");

        tower.registerAirplane(avion1);
        tower.registerAirplane(avion2);
        tower.registerAirplane(avion3);

        avion1.send("Demande d'autorisation d'atterrissage sur la piste 1. AF-123");
    }
}
