package org.appLogger;

public class Main {

    static void main(String[] args) {
        AppLogger logger = AppLogger.getInstance();
        logger.log("test");

        AppLogger logger1 = AppLogger.getInstance();
        logger1.log("test2");

        System.out.println(logger1 == logger);
    }
}
