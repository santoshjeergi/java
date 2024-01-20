package DesignPatterns.Factory.refactorEx.factory;

import DesignPatterns.Factory.refactorEx.Button.Button;
import DesignPatterns.Factory.refactorEx.Button.HTMLButton;

public class HTMLDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
