package org.compression;

public class File implements FileComponent{
    @Override
    public void sauvegarder(String contenu) {
        System.out.println("Sauvegarde de " + contenu);
    }
}
