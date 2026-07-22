package org.fileSystem;

public class Main {
    static void main(String[] args) {
        File file = new File("fichier1",1234);
        File file2 = new File("fichier2",2345);
        File file3 = new File("fichier3",335679);

        Folder folder = new Folder("dossier1");
        folder.addFileSystem(file);

        Folder folder1 = new Folder("dossier2");
        folder1.addFileSystem(file2);
        folder1.addFileSystem(file3);
        folder1.addFileSystem(folder);

        System.out.println("Size folder1 " + folder1.getSize() + " Mo");
        System.out.println("Size folder " + folder.getSize() + " Mo");

        System.out.println(folder1);
    }
}
