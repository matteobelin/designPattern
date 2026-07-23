package org.compression;

public class Main {
    static void main() {
        FileComponent file = new File();

        file.sauvegarder("Test");

        FileComponent file2 = new CompressionDecorator(new File());
        file2.sauvegarder("Test 2");

        FileComponent file3 = new ChiffrementDecorator(new CompressionDecorator(new File()));
        file3.sauvegarder("Test 3");
    }
}
