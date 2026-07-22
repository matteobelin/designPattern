package org.fileSystem;

import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystem{
    private final List<FileSystem> fileSystemsList = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public long getSize(){
        return fileSystemsList.stream()
                .mapToLong(FileSystem::getSize)
                .sum();
    }

    public void addFileSystem(FileSystem fileSystem){
        this.fileSystemsList.add(fileSystem);
    }
}
