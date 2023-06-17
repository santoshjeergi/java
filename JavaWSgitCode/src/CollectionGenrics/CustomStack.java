package CollectionGenrics;

import java.util.ArrayList;
import java.util.List;

public class CustomStack<T> {

    List<T>  array = new ArrayList<>();

    public void push(T val)
    {
        array.add(val);
    }

    public T peek()
    {
        return array.get(array.size()-1);
    }
    public T pop()
    {
        T val = array.get(array.size()-1);
        array.remove(array.size()-1);
        return val;
    }
}
