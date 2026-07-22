package org.application.windows;

import org.application.UiFactory;
import org.application.Button;
import org.application.Checkbox;

public class WindowsFactory implements UiFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WindowsCheckbox();
    }
}
