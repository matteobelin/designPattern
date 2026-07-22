package org.flotte.moteur;

public class MoteurElectrique implements Moteur {

    @Override
    public float autonomieRestante(float niveauCarburant){
        return niveauCarburant / 20;
    }
}
