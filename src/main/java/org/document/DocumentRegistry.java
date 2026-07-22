package org.document;

import java.util.HashMap;
import java.util.Map;

public class DocumentRegistry {
    private final Map<String, DocumentPrototype> documents = new HashMap<>();

    public void addDocument(String type, DocumentPrototype document){
        documents.put(type, document);
    }

    public DocumentPrototype getDocument(String type){
        return documents.get(type).getClone();
    }
}
