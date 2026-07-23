package org.compression;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ChiffrementDecorator implements FileComponent{
    private final FileComponent fileComponent;

    @Override
    public void sauvegarder(String contenu) {
        fileComponent.sauvegarder("Chiffrement(" + contenu + ")");
    }
}
