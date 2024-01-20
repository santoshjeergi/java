package JavaOOPSConstruct.SOLID;

public class Car{
    IEngine engine;
    int mileage;

    String name;

    Car(int mileage, String name)
    {
        this.mileage = mileage;
        this.name = name;
    }
    void start()
    {
        engine.start();
    }

    void stop()
    {
        engine.stop();
    }
}
