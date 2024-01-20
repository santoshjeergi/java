package DesignPatterns.Flyweight.Tree;

import java.awt.*;

public class Tree {
    private int x;
    private int y;
    private TreeType type;

   public  Tree(int x, int y, TreeType type)
    {
        x = this.x;
        y = this.y;
        type = this.type;
    }
    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
