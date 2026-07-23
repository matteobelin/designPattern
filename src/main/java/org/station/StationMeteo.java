package org.station;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class StationMeteo implements Observable{
    private final List<Observateur> observateurs = new ArrayList<>();

    private Mesure mesure;

    @Override
    public void ajouterObservateur(Observateur observateur) {
        observateurs.add(observateur);
    }

    @Override
    public void notifierObservateurs() {
        observateurs.forEach(observateur -> observateur.actualiser(this.mesure));
    }

    public void nouvelleMesure(Mesure nouvelleMesure){
        this.mesure = nouvelleMesure;
        notifierObservateurs();
    }
}
