package Test;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {

        HashSet<point> pointHashSet = new HashSet<>();
        pointHashSet.add(new point(2, 4));
        pointHashSet.add(new point(2, 4));
        pointHashSet.add(new point(12, 14));

        for(point p : pointHashSet)
        {
           // System.out.println(p);
        }


       // demo1(new HashSet<>());
       // demo1(new LinkedHashSet<>()); // order is retained

       demo2();

    }
    static class Car implements Comparable<Car>{
        int speed;
        int power;

        Car(int speed, int power)
        {
            this.power = power;
            this.speed = speed;
        }

        @Override
        public int compareTo(Car o) {
            return o.speed - this.speed;
            //return 0;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "speed=" + speed +
                    ", power=" + power +
                    '}';
        }
        static  class comparePower implements Comparator<Car> {
            @Override
            public int compare(Car o1, Car o2) {

                return  o1.power - o2.power;
            }
        }
        public  static final comparePower comparePowerc  = new comparePower();
    }

    public static void demo2()  //comparator /*https://github.com/sumeet-at-scaler/current-class-code/blob/main/6th%20June%202023/Lect_Begin_CRA/CollectionsDemo.java*/
    {
        Car c1 = new Car(100, 20);
        Car c2 = new Car(200, 210);
        Car c3 = new Car(50, 120);
        Car c4 = new Car(120, 201);

//        PriorityQueue<Car> priorityQueue = new PriorityQueue<>();
//        PriorityQueue<Car> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Car> priorityQueue = new PriorityQueue<>(new Car.comparePower());
        priorityQueue.add(c1);
        priorityQueue.add(c2);
        priorityQueue.add(c3);
        priorityQueue.add(c4);
        System.out.println(priorityQueue);
    }
    public static void demo1(Set<String> setString)
    {
        setString.add("India");
        setString.add("Pak");
        setString.add("Chin");
        setString.add("US");
        setString.add("Pak");
        System.out.println(setString);

    }
}



class point {
    int x;
    int y;

    point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
      //  if (this == o) return true;
       // if (o == null || getClass() != o.getClass()) return false;
        point point = (point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        //return Objects.hash(x, y);
        return x + y;
    }
}
















     /*String s1 = "hello";
     String s2 = new String("hello");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        s1 = s1.replace('l', 'd');
        System.out.println(s1);


        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        */

   /* ArrayList<Integer> arrayList = new ArrayList<Integer>();
    arrayList.add(10);
        arrayList.add(20);

        for(Integer i: arrayList)
        {
            System.out.println(i);
        }

        Iterator<Integer> it = arrayList.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
*/


    //}
//}
