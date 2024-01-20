package DesignPatterns.SOLID;

public class Sparrow extends Bird{

    private Flayator fref;
    //constructor injection
    public Sparrow( Flayator fr){
        //super(fr);
        this.fref = fr;
    }

    //Method injection
    public void setFref(Flayator fr) {
        this.fref = fr;
    }
    void fly() {
        if(fref == null) {
            System.out.println("not set");
            return;
        }
        fref.fly();
    }
}
