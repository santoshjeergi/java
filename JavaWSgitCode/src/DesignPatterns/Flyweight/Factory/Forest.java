package DesignPatterns.Flyweight.Factory;

import DesignPatterns.Flyweight.Tree.Tree;
import DesignPatterns.Flyweight.Tree.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {

    List<Tree> trees = new ArrayList<>();

public void plantTree(int x, int y, String name, String otherInfo, Color c)
{
    TreeType TrrType  = TreeFactory.getTreeType(name, otherInfo, c);
    Tree tree  = new Tree(x, y, TrrType);
    trees.add(tree);
}

public void paint (Graphics g)
{
    for(Tree tree: trees){
        tree.draw(g);
    }
}
}
