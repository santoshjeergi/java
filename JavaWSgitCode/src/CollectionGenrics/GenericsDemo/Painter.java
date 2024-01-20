package CollectionGenrics.GenericsDemo;

/*public class Painter < T extends Building> { /*means upper bound is building  - Takes list of building to paint
}*/


import java.util.List;

public class Painter < T extends Building> {
    public void paint( T Building)  {
     Building.paint();
    }

    void paint(List<? extends Building> list ) {  /*wild card character ? instead of T, applicable only at the method level,
       because not using the T*/
        for(Building b : list)
        {
            b.paint();
        }
    }
}
