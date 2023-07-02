package DesignPatterns.SOLID;

public class Client {

    public static void main(String[] args) {
        Flayator fr = new fastFlayator();
         //Bird b = new Sparrow(fr);
        Sparrow s = new Sparrow(new slowFlayator());
        s.fly();
        s.setFref(fr);
        s.fly();
    }

}
