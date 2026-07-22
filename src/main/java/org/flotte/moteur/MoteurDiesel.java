package org.flotte.moteur;

public class MoteurDiesel implements Moteur {

    @Override
    public float autonomieRestante(float niveauCarburant){
        return niveauCarburant / 5;
    }
}
