package Test;

import java.util.Iterator;

public class DemoIterator {

    public static void main(String[] args) {
//Link list
          node n1 = new node(10, null);
          node n2 = new node(20, n1);
          node n3 = new node(100, n2);


          for(int n: n3)
          {
              System.out.println(n);
          }

          Iterator<Integer> iterator = n3.iterator();

          while(iterator.hasNext())
          {
              int val  = iterator.next();
              System.out.println(" :" + val);
          }
    }

   public static class node implements Iterable<Integer>{
        private int x;
        private node next;
        node(int x, node next){
            this.x = x;
            this.next = next;
        }

        @Override
        public Iterator<Integer> iterator() {

            return new nodeIterator(this);
        }

       public static class nodeIterator implements Iterator<Integer> {
            private node temp;

            nodeIterator(node t)
            {
                temp = t;
            }
            @Override
            public boolean hasNext() {
                return temp != null;
            }

            @Override
            public Integer next() {
                Integer i = temp.x;
                temp = temp.next;
                return i;
            }
        }
    }
}
