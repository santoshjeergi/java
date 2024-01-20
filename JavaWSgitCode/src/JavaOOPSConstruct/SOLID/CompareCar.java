package JavaOOPSConstruct.SOLID;

public class CompareCar implements Comparable<CompareCar>{
    Car c;
    /*int mileage;
    String name;*/
    CompareCar(Car c)
    {

        this.c = c;

    }
    @Override
    public int compareTo(CompareCar o) {
        return c.mileage - o.c.mileage;
    }
}
