package patterns.abstractFactory.factories;

import patterns.abstractFactory.buttons.Button;
import patterns.abstractFactory.checkbox.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
