package DesignPatterns.Factory.refactorEx;

import DesignPatterns.Factory.refactorEx.factory.Dialog;
import DesignPatterns.Factory.refactorEx.factory.HTMLDialog;
import DesignPatterns.Factory.refactorEx.factory.WindowDialog;



/*Refactor:

        https://refactoring.guru/design-patterns/factory-method/java/example#example-0
        https://refactoring.guru/design-patterns/factory-method

 */
public class Client {

    static Dialog d;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    public static void runBusinessLogic()
    {
        d.renderWindow();
    }

    public static void configure()
    {
        System.out.println("System:" + System.getProperty("os.name"));
        if(System.getProperty("os.name").equals("Windows 10")) {
            d = new WindowDialog();
        } else {
            d = new HTMLDialog();
        }

    }
}
