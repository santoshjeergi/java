package Test.Practice1Iter;

import java.util.ArrayList;

public class Stack <T> {
    private ArrayList<T> arrayList;
    Stack()
    {
        arrayList = new ArrayList<>();
    }
    T pop() {
        T t =  arrayList.get(arrayList.size()-1);
        arrayList.remove(arrayList.size()-1);
        return t;
    }
    void push(T t) {
         arrayList.add(t);
    }
    T peek()
    {
        T t =  arrayList.get(arrayList.size()-1);
       // arrayList.remove(arrayList.size()-1);
        return t;
    }
}
