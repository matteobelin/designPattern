package org.template;

public class Main {
    static void main() {
        DataMiner csvMiner = new CsvDataMiner();
        csvMiner.mine("donnees.csv");

        System.out.println("------------");

        DataMiner pdfMiner = new PdfDataMiner();
        pdfMiner.mine("rapport.pdf");
    }
}
