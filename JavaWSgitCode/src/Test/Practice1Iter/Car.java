package Test.Practice1Iter;

public class Car implements Comparable<Car>{
    private int mileage;
    private int power;
    private String name;

    Car( int mileage, int power, String name)
    {
        this.mileage = mileage;
        this.power = power;
        this.name = name;
    }


    public int getMileage() {
        return mileage;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    @Override
    public int compareTo(Car o) {
        if(this.mileage == o.mileage) {
            return  o.power - this.power;
        }
        else {
            return   this.mileage - o.mileage;
        }
    }

    /*public String toString()
    {
        System.out.println();
    }*/

    @Override
    public String toString() {
        return "Car{" +
                "mileage=" + mileage +
                ", power=" + power +
                ", name='" + name + '\'' +
                '}';
    }
}
