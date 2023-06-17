package CollectionGenrics;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {

    public void DemoStack()
    {
        Stack<Object> stack = new Stack<>();
        stack.push(new Integer(23));
        stack.push(new String("kumar"));

        while(!stack.empty())
        {
            Object obj = stack.pop();
            System.out.print(obj + " " + obj.getClass());
            System.out.print("  IsInterger? " );
            System.out.print(  obj instanceof Integer );
            System.out.print("   IsString?" );
            System.out.println( obj instanceof String );
        }
    }

    public void DemoCustomStack()
    {
        CustomStack<Integer> integerCustomStack  = new CustomStack<>();
        integerCustomStack.push(34);
        integerCustomStack.push(54);

        System.out.println(integerCustomStack.peek());
        System.out.println(integerCustomStack.pop());
        System.out.println(integerCustomStack.pop());
    }

    public void TryThings()
    {
        Queue<Integer> t = new ConcurrentLinkedQueue<>();

        int [] array = {3,4,5,6};

        for(int v: array)
        {
            System.out.println(v);
        }

        List<String> s  = new ArrayList<>();
        s.add("coffe");

        for(String s1 : s)
        {
            System.out.println(s1);

        }

        System.out.println(Arrays.toString(array));

    }

    public static void main(String[] args) {
        

    }
}
