package org.compression;

public class CompressionDecorator extends Decorator{
    public CompressionDecorator(FileComponent fileComponent) {
        super(fileComponent);
    }

    @Override
    public void sauvegarder(String contenu) {
        super.sauvegarder("ZIP(" + contenu + ")");
    }
}
