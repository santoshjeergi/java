package CollectionGenrics.HashSetPoint;

import java.util.*;

public class Main {
    public static void demo0HashSet_Equals_Hashcode()
    {
        /*Equals and hashcode*/
        HashSet<Point> hashSet = new HashSet<>();

        Point p1 = new Point(10, 12);
        Point p2 = new Point(32, 43);
        Point p3 = new Point(10, 12);

        hashSet.add(p1);

        hashSet.add(p2);

        hashSet.add(p3);

        for (Point p : hashSet)
        {
            System.out.println(p);
        }
    }

    public  static void demo1_HashSet()
    {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("India");
        hashSet.add("America");
        hashSet.add("UK");
        hashSet.add("Canada");


        for(String country: hashSet)
        {
            System.out.println(country);
        }
    }
    public  static void demo2_LinkHashSet()  /*Provides the way to retrive the order of inputs over hash set */
    {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("India");
        linkedHashSet.add("America");
        linkedHashSet.add("UK");
        linkedHashSet.add("Canada");


        for(String country: linkedHashSet)
        {
            System.out.println(country);
        }
    }

    public  static  void demo1PriorityQueue_Customobjects()
    {
        PriorityQueue<Car> pQcar = new PriorityQueue<>();

        Car c1 = new Car(200, 12, "Indica");
        Car c2 = new Car(100, 121, "tata");
        Car c3 = new Car(100, 212, "ferrarr");
        Car c4 = new Car(200, 125, "gamlpe");
        pQcar.add(c1);
        pQcar.add(c2);
        pQcar.add(c3);
        pQcar.add(c4);

       /* for(Car c: pQcar)
        {
            System.out.println(c);
        }*/

        while(pQcar.size() > 0)
        {
            System.out.println(pQcar.remove());
        }
    }
    public  static  void demo2PriorityQueue_CustomComparator( boolean reverse)
    {
        Comparator<Car> customComp =  new Car.customCompareSpeed();
        //PriorityQueue<Car> pQcar = reverse ? new PriorityQueue<>(customComp.reversed()): new PriorityQueue<>(customComp);
          /*OR*/
        //PriorityQueue<Car> pQcar  = new PriorityQueue<>(Car.compareSpeed.reversed());



        Comparator<Car> obj = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                //return o1.getName().compareTo(o2.getName());
                return o1.getMileage() - o2.getMileage();
            }
        };
        PriorityQueue<Car> pQcar = new PriorityQueue<>(Collections.reverseOrder(obj));


       // PriorityQueue<Car> pQcar = new PriorityQueue<>(new Car.customCompareSpeed().reversed());
        Car c1 = new Car(200, 12, "Indica");
        Car c2 = new Car(100, 121, "tata");
        Car c3 = new Car(100, 212, "ferrarr");
        Car c4 = new Car(200, 125, "gamlpe");
        pQcar.add(c1);
        pQcar.add(c2);
        pQcar.add(c3);
        pQcar.add(c4);

       /* for(Car c: pQcar)
        {
            System.out.println(c);
        }*/

        while(pQcar.size() > 0)
        {
            System.out.println(pQcar.remove());
        }
    }

    public  static void demo_TreeSet()
    {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(90);
        treeSet.add(3);
        treeSet.add(100);
        treeSet.add(50);
        treeSet.add(6);

        System.out.println(treeSet.ceiling(50)); //50
        System.out.println(treeSet.floor(50));
        treeSet.




    }
    public static void main(String[] args) {
        //demoHashSet_Equals_Hashcode();
      //  demo1_HashSet();
        //demo2_LinkHashSet();
        //demo1PriorityQueue_Customobjects();
        //demo2PriorityQueue_CustomComparator(true);
        demo_TreeSet();
    }






}
