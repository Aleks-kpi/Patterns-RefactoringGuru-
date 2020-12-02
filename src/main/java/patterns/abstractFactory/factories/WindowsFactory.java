package patterns.abstractFactory.factories;

import patterns.abstractFactory.buttons.Button;
import patterns.abstractFactory.buttons.WindowsButton;
import patterns.abstractFactory.checkbox.Checkbox;
import patterns.abstractFactory.checkbox.WindowsCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
