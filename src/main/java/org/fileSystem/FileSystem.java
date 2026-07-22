package org.fileSystem;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class FileSystem {
    @Getter
    protected final String name;

    public abstract long getSize();
}
