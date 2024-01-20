package Test.Practice1Iter;

import java.util.Iterator;

public class LinkList implements Iterable<LinkList>{
    private int data;
    private LinkList next;

    public int getdata()
    {
        return data;
    }
    LinkList(int data, LinkList next)
    {
        this.data = data ;
        this.next = next;
    }

    public Iterator<LinkList> iterator() {

        return new LinkListIterator(this);
    }



    public static class LinkListIterator implements Iterator<LinkList>{

        private LinkList temp;
        LinkListIterator(LinkList temp){
            this.temp  = temp;
        }
        @Override
        public boolean hasNext() {
            return temp != null;
        }

        @Override
        public LinkList next() {
            LinkList t = temp;
            temp = temp.next;
            return t;
        }

        @Override
        public String toString() {
            return "LinkListIterator{" +
                    "tempdata=" + temp.data +
                    '}';
        }
    }


}
