package CollectionGenrics.HashSetPoint;

import java.util.Comparator;

public class Car implements Comparable<Car>{
    private int mileage;
    private  int speed;
    private String name;
    Car(int mileage, int speed, String name)
    {
        this.mileage = mileage;
        this.speed = speed;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mileage=" + mileage +
                ", speed=" + speed +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car o) {
       /* if(this.mileage > o.mileage)
        {
            return 1;
        } else if (this.mileage < o.mileage)
        {
            return -1;
        } else
        {
            return 0;
        }*/
        //alternate simpler way
        return this.mileage - o.mileage;

        //return 0;
    }

    public  static  customCompareSpeed compareSpeed = new customCompareSpeed();
    public static  class customCompareSpeed implements Comparator<Car>
    {
        @Override
        public int compare(Car o1, Car o2) {
            if(o1.mileage == o2.mileage)
              return o1.speed - o2.speed;
            else
                return o1.mileage - o2.mileage;
        }
    }


}
