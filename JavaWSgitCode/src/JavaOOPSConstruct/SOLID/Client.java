package JavaOOPSConstruct.SOLID;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
    public static void main(String[] args) {
        /*Car c1 = new Car();
        c1.engine = new HyndaiEngine();
        c1.start();
        c1.stop();


        Car c2 = new Car();
        c2.engine = new Toyato();
        c2.start();
        c2.stop();
        */

        CompareCar c3 = new CompareCar( new Car(100,"A"));



        CompareCar c4 = new CompareCar(new Car(200,"b"));


        ArrayList<CompareCar> listCar = new ArrayList<>();


        listCar.add(c3);
        listCar.add(c4);
        Collections.sort(listCar);

        for( CompareCar c : listCar)
        {
            System.out.println(c.c.mileage);
        }

    }
}
