package patterns.abstractFactory.factories;

import patterns.abstractFactory.buttons.Button;
import patterns.abstractFactory.buttons.MacOSButton;
import patterns.abstractFactory.checkbox.Checkbox;
import patterns.abstractFactory.checkbox.MacOSCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
