package org.compression;

public class ChiffrementDecorator extends Decorator{
    public ChiffrementDecorator(FileComponent fileComponent) {
        super(fileComponent);
    }

    @Override
    public void sauvegarder(String contenu) {
        super.sauvegarder("Chiffrement(" + contenu + ")");
    }
}
