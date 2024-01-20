package DesignPatterns.Flyweight.Factory;


import DesignPatterns.Flyweight.Tree.TreeType;

import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    public  static Map<String, TreeType> types = new HashMap<>();

    public  static TreeType getTreeType(String name, String otherInfom, Color color)
    {
        TreeType result = types.get(name);
        if(result == null)
        {
            result = new TreeType(name, color, otherInfom);
            types.put(name,result);
        }
        return result;
    }
}
