package patterns.factoryMethod.factory;

import patterns.factoryMethod.buttons.Button;
import patterns.factoryMethod.buttons.WindowsButton;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
