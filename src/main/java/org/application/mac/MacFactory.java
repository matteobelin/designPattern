package org.application.mac;

import org.application.UiFactory;
import org.application.Button;
import org.application.Checkbox;

public class MacFactory implements UiFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacCheckbox();
    }
}
