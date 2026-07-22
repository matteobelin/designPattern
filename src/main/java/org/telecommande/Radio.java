package org.telecommande;

public class Radio implements Device{
    private boolean enabled = false;
    private int volume = 0;
    private int channel = 0;

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enabled() {
        this.enabled = true;
    }

    @Override
    public void disabled() {
        this.enabled = false;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }
}
