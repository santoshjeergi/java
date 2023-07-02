package CollectionGenrics.GenericsDemo;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //Painter<Integer> p = new Painter<Integer>(); /* type argument java.lang.Integer is not within bounds of type-variable T*/
        Painter<Building> p = new Painter<>();
        p.paint(new Building());
        Painter<House> h = new Painter<>();
        h.paint(new House());


        String s = "testsring";
        String s1 = s;

        System.out.println(s==s1);


/*uTIL u = new uTIL();
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(30);
        u.PrintList(l);*/
    }
}
