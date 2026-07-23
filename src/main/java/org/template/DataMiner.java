package org.template;

public abstract class DataMiner {
    public final void mine(String path){
        openFile(path);
        extractData();
        parseData();
        closeFile(path);
    };

    protected void openFile(String path){
        System.out.println("Open file path : " + path);
    }

    protected void closeFile(String path){
        System.out.println("Close file path : " + path);
    }

    protected abstract void extractData();

    protected abstract void parseData();

}
