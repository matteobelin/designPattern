package org.canard;

import org.canard.canard.Canard;
import org.canard.canard.CanardPlastique;

public class Main {
    static void main() {
        System.out.println("\n------------------------------------\n");

        Canard canard = new Canard();
        System.out.println("Canard :");
        canard.cancaner();
        canard.voler();

        System.out.println("\n------------------------------------\n");

        CanardPlastique canardPlastique = new CanardPlastique();
        System.out.println("Canard Plastique :");
        canardPlastique.cancaner();
        canardPlastique.voler();
    }
}
