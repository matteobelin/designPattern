package org.application.mac;

import org.application.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Bouton mac");
    }
}
