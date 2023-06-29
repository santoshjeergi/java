package CollectionGenrics.GenericsDemo;

import java.util.List;

public class uTIL {

    public<T>  void  PrintList(List<T> list)
    {
        for( Object l: list)
        {
            System.out.println(l);
        }
    }
}
