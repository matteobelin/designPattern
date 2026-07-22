package org.telecommande;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class RemoteControle {
    protected final Device device;

    public void powerButton(){
        if (device.isEnabled()) {
            device.disabled();
        } else {
            device.enabled();
        }
    }

    public void setVolume(int volume){
        device.setVolume(volume);
    }

    public int getVolume(){
        return device.getVolume();
    }

    public void setChannel(int channel){
        device.setChannel(channel);
    }

    public int getChannel(){
        return device.getChannel();
    }
}
