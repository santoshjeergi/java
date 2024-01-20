package Test.Practice1Iter;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    //demoPoint_HashSet() - Iterable, Iterator
        //demoCar_PriorityQ() - Comparable. comparator
        // demo_Treeset(
//demo_LinkListIterable()
    // demo_genericsStack()

    }
    public  static void demo_genericsStack()
    {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("A");
        stringStack.push("B");
        System.out.println(stringStack.peek());
        stringStack.push("  C");
        System.out.println(stringStack.peek());
        stringStack.pop();
        System.out.println(stringStack.peek());
    }
    public  static void demo_LinkListIterable()
    {
        LinkList list1 = new LinkList(10, null);
        LinkList list2 = new LinkList(2, list1);
        LinkList list3 = new LinkList(30, list2);
        LinkList list4 = new LinkList(4, list3);
        LinkList list5 = new LinkList(50, list4);
        //5->4->3->2->1->null

        for(LinkList list: list5)
        {
            System.out.println(list.getdata());
        }
    }
    public static void demo_Treeset()
    {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(15);
        treeSet.add(9);
        treeSet.add(50);

        //System.out.println(treeSet.ceiling(16));
        System.out.println(treeSet.floor(19));
    }
    public static void demoCar_PriorityQ()
    {
        Car c1 = new Car(200, 35, "maruti");
        Car c2 = new Car(120, 40, "aaruti");
        Car c3 = new Car(20, 110, "daruti");
        Car c4 = new Car(100, 20, "faruti");

        Comparator<Car> powerCompare = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getPower() - o2.getPower();
            }
        };
        PriorityQueue<Car> carPriorityQueue = new PriorityQueue<>(powerCompare);//(Collections.reverseOrder());
        carPriorityQueue.add(c1);
        carPriorityQueue.add(c2);
        carPriorityQueue.add(c3);
        carPriorityQueue.add(c4);


        while(carPriorityQueue.size() > 0)
        {
            System.out.println(carPriorityQueue.remove());
        }
       /* for(Car c: carPriorityQueue) //this will not give the idea
        {
            System.out.println(c);
        }*/
    }
    public static void demoPoint_HashSet()
    {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(21, 32);
        Point p3 = new Point(3, 2);

        HashSet<Point> pointHashSet = new HashSet<>();
        pointHashSet.add(p1);
        pointHashSet.add(p2);
        pointHashSet.add(p3);

        for(Point p: pointHashSet)
        {
            System.out.println(p);
        }

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("India");
        hashSet.add("India1");
        hashSet.add("africaIndia");
        for(String s : hashSet)
        {
            System.out.println(s);
        }

        System.out.println("LinkedHashse Demo");
        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();
        stringLinkedHashSet.add("India");
        stringLinkedHashSet.add("India1");
        stringLinkedHashSet.add("africaIndia");
        for(String s : stringLinkedHashSet)
        {
            System.out.println(s);
        }
    }
}
