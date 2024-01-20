package DesignPatterns.Factory.refactorEx.factory;

import DesignPatterns.Factory.refactorEx.Button.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        //okButton.Onclick();
        okButton.render();
    }

    public abstract Button createButton();
}
