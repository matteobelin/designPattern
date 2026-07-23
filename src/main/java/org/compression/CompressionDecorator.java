package org.compression;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CompressionDecorator implements FileComponent{
    private final FileComponent fileComponent;

    @Override
    public void sauvegarder(String contenu) {
        fileComponent.sauvegarder("ZIP(" + contenu + ")");
    }
}
