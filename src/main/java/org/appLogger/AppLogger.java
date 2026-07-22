package org.appLogger;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AppLogger {

    @Getter
    private static final AppLogger instance = new AppLogger();
    private int count;

    public synchronized void log(String message) {
        count++;
        System.out.println("[LOG #" + count + "] " + message);
    }
}
