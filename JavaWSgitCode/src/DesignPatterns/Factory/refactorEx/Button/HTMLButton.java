package DesignPatterns.Factory.refactorEx.Button;

public class HTMLButton implements Button{
    @Override
    public void render() {
        System.out.println("Rending HTMLButton");
        Onclick();
    }

    @Override
    public void Onclick() {
        System.out.println("Onclick HTML ");
    }
}
