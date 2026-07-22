package org.flotte.moteur;

public class MoteurEssence implements Moteur {

    @Override
    public float autonomieRestante(float niveauCarburant){
        return niveauCarburant / 10;
    }
}
