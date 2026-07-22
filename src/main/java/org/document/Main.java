package org.document;

import java.util.List;

public class Main {
    static void main(String[] args) {
        List<String> section = List.of("Introduction", "Statistiques", "Conclusion");
        DocumentRegistry registry = new DocumentRegistry();
        ReportDocument reportDocument = new ReportDocument("titre", "header", section);


        registry.addDocument("financier", reportDocument);

        DocumentPrototype aliceDoc = registry.getDocument("financier");
        DocumentPrototype bobDoc = registry.getDocument("financier");

        aliceDoc.addSection("Analyse Q3");
        bobDoc.removeSection("Introduction");

        System.out.println("Report Doc:\n" + reportDocument + "\n");
        System.out.println("Alice Doc \n" + aliceDoc + "\n");
        System.out.println("Bob Doc \n" + bobDoc + "\n");
    }
}
