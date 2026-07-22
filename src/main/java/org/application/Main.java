package org.application;

import org.application.mac.MacFactory;
import org.application.windows.WindowsFactory;

import java.util.List;

public class Main {

    static MacFactory macFactory = new MacFactory();
    static WindowsFactory windowsFactory = new WindowsFactory();

    static void main(String[] args){
        List<UiFactory> abstractFactories = List.of(macFactory,windowsFactory);
        abstractFactories.forEach(os ->{
                Button button = os.createButton();
                Checkbox checkox = os.createCheckBox();
                button.render();
                checkox.render();
            }
        );
    }
}
