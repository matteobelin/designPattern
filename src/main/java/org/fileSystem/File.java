package org.fileSystem;

import lombok.Getter;

public class File extends FileSystem{
    @Getter
    long size;

    public File(String name, long size) {
        super(name);
        this.size = size;
    }
}
