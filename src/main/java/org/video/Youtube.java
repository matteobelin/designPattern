package org.video;

public class Youtube implements Lib {
    @Override
    public String download(int videoId) {
        try {
            Thread.sleep(3000);

        } catch (InterruptedException _){}
        return "vidéo telechargé";
    }
}
