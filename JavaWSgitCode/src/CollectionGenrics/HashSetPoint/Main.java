package CollectionGenrics.HashSetPoint;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
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


}
