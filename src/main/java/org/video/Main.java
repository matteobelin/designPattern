package org.video;

import java.time.LocalDateTime;

public class Main {
    static void main(String[] args) {
        Lib youtube = new Youtube();
        Lib proxy = new Proxy(youtube);
        System.out.println("Vidéo 123" + proxy.download(123) + " A " + LocalDateTime.now());
        System.out.println("Vidéo 123" + proxy.download(123) + " A " + LocalDateTime.now());
        System.out.println("Vidéo 456" + proxy.download(456) + " A " + LocalDateTime.now());
    }
}
