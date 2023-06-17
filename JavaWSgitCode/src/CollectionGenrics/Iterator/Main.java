package CollectionGenrics.Iterator;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Node n0  = new Node(10, null);
        Node n1 = new Node(20, n0 );
        Node n2 = new Node(30, n1);


       //Approach 1 : this requires the Node class members to be private, not good

        /* Node temp  = n2;
        while(temp != null)
        {
            System.out.println(temp);
            temp  = temp.next;
        }*/


        //Approach 2:
        Iterator itr = n2.iterator();

        while(itr.hasNext()) {
            Integer i = (Integer)itr.next();
            System.out.println(i);
        }
        // syntactic sugar for Approch 2 to automate the actual iteration
        for(Integer i: n2)
        {
            System.out.println(i);
        }


    }
}
