package org.document;

public interface DocumentPrototype {
    DocumentPrototype getClone();
    void addSection(String section);
    void removeSection(String section);
}
