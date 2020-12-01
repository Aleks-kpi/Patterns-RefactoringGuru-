package patterns.factoryMethod.factory;

import patterns.factoryMethod.buttons.Button;
import patterns.factoryMethod.buttons.HtmlButton;

/**
 * HTML - диалог
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
