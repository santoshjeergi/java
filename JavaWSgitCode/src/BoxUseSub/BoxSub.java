package BoxUseSub;

import javax.swing.*;
import java.util.*;

final public class BoxSub { //extends Box

    public static <T> void printArray(T[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.println("v1 "+ a[i]);
        }
    }
    public static void main(String[] args) {

       List<String> list1 = new LinkedList<>();
        list1.add("Scaler");

        list1.add("For");

        list1.add("Coders");

        list1.add("InterviewBit");

        list1.add("Coders");

        List<String> list2 = new LinkedList<>();
        list2.add("Coders");

        list1.removeAll(list2);

        for(String l: list1)
        {
            System.out.println(l);
        }

    }
}
