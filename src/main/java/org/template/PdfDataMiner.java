package org.template;

public class PdfDataMiner extends DataMiner{
    @Override
    protected void extractData() {
        System.out.println("Extract Pdf data");
    }

    @Override
    protected void parseData() {
        System.out.println("Parse Pdf data");
    }
}
