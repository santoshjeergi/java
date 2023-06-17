package CollectionGenrics.Iterator;

import java.util.Iterator;

public class Node implements  Iterable<Integer>{
    private int data;
     private Node next;

    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    @Override
    public Iterator<Integer> iterator() {
        return new NodeIterator(this); //next
    }


    public  static  class NodeIterator implements Iterator<Integer>
     {
        private Node temp;

         NodeIterator(Node temp)
         {
             this.temp = temp;
         }

         @Override
         public boolean hasNext() {

             return temp != null;
         }

         @Override
         public Integer next() {
             Integer val = temp.data;
             temp = temp.next;
             return val;
         }
     }
}
