package DesignPatterns.Flyweight;

import DesignPatterns.Flyweight.Factory.Forest;
//https://refactoring.guru/design-patterns/flyweight
//https://refactoring.guru/design-patterns/flyweight/java/example#lang-features
import javax.swing.*;
import java.awt.*;

public class Client {
    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 1000000;
    static int TREE_TYPES = 2;

    public static void main(String[] args) {
        Forest f = new Forest();

        for(int i = 0; i < Math.floor(TREES_TO_DRAW/TREE_TYPES); i++){
            f.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Summer Oak",  "oak texture stub", Color.GREEN);
            f.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Autumn Oak",  "Autumn oak tree", Color.ORANGE);
        }
        f.setSize(CANVAS_SIZE, CANVAS_SIZE);
        f.setVisible(true);
       // Graphics g  = new DebugGraphics();

    }
    private static int random(int min, int max) {
        return min + (int)(Math.random() *(max - min) +1);
    }
}
