package org.document;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class ReportDocument implements DocumentPrototype{

    private String title;
    private String header;
    private List<String> sections;

    @Override
    public DocumentPrototype getClone() {
        return new ReportDocument(this.title, this.header, new ArrayList<>(this.sections));
    }

    @Override
    public void addSection(String section){
        sections.add(section);
    }

    @Override
    public void removeSection(String section){
        sections.remove(section);
    }

    @Override
    public String toString() {
        return "Title : " + this.title
                + "\nHeader : " + this.header
                + "\nSections : " + this.sections;
    }
}
