package DesignPatterns.SOLID;

public class slowFlayator implements Flayator{
    @Override
    public void fly() {
        System.out.println("slow flyator");
    }
}
