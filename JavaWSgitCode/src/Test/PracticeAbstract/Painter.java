package Test.PracticeAbstract;

import DesignPatterns.BuilderVer7.Student;

import java.util.List;

public class Painter < T extends Building> {

    public void paint(T bldng)
    {
        bldng.paint();
    }

    public void paint(List<? extends Building> list)
    {
        for(Building b: list)
        {
            b.paint();
        }
    }

}
