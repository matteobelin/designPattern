package org.telecommande;

public class AdvancedRemote extends RemoteControle{
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute(){
        super.device.setVolume(0);
    }
}
