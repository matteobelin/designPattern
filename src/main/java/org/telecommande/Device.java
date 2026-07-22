package org.telecommande;

public interface Device {
    boolean isEnabled();
    void enabled();
    void disabled();
    int getVolume();
    void setVolume(int volume);
    int getChannel();
    void setChannel(int channel);
}
