package org.telecommande;

public class Main {
    static void main(String[] args) {
        Device TV = new TV();

        BasicRemote basicRemote = new BasicRemote(TV);
        basicRemote.setVolume(1);
        System.out.println("Volume " + basicRemote.getVolume());

        AdvancedRemote advancedRemote = new AdvancedRemote(TV);
        advancedRemote.mute();
        System.out.println("Volume "+ advancedRemote.getVolume());
    }
}
