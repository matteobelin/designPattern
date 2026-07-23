package org.station;

public interface Observable {
    void ajouterObservateur(Observateur observateur);
    void notifierObservateurs();
}
