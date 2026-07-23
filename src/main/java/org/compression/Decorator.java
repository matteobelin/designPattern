package org.compression;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Decorator implements FileComponent{
    private final FileComponent fileComponent;

    @Override
    public void sauvegarder(String contenu) {
        fileComponent.sauvegarder(contenu);
    }
}
