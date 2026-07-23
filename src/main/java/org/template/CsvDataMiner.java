package org.template;

public class CsvDataMiner extends DataMiner{
    @Override
    protected void extractData() {
        System.out.println("Extract CSV data");
    }

    @Override
    protected void parseData() {
        System.out.println("Parse CSV data");
    }
}
