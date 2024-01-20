package DesignPatterns.Flyweight.Tree;

import java.awt.*;

;
public class TreeType {
    private String name;
    private String otherInfo;
    private Color colour;


    public  TreeType( String name, Color c, String otherInfo)
    {
        this.name = name;
        this.colour = c;
        this.otherInfo = otherInfo;
    }
   public void draw(Graphics g, int x, int y)
   {
       g.setColor(Color.BLACK);
       g.fillRect(x-1, y, 3, 5);
       g.setColor(colour);
       g.fillOval(x-5, y-10, 10, 10);
   }
}