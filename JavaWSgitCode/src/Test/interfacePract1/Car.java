package Test.interfacePract1;

public class Car{
    Engine e;
    Car(Engine e)
    {
        this.e = e;
    }
    public void changeEngine(Engine e)
    {
        this.e = e;
    }
    public void start()
    {
        e.start();
    }
    public void stop()
    {
        e.stop();
    }
}
