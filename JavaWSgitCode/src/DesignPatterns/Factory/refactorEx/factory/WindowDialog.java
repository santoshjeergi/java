package DesignPatterns.Factory.refactorEx.factory;

import DesignPatterns.Factory.refactorEx.Button.Button;
import DesignPatterns.Factory.refactorEx.Button.WindowButton;

public class WindowDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
