package DesignPatterns.SOLID;

public class Client {

    Flayator fr = new fastFlayator();
   // Bird b = new Sparrow(fr);
    Sparrow s = new Sparrow(fr);
    s.fly()
}
