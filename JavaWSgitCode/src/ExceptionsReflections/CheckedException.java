package ExceptionsReflections;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

    public static void fun1() throws FileNotFoundException {
        fun2();
    }
    public static void fun2() throws FileNotFoundException
    {
       // fun2(); stackoverflow

        File f = new File("abc.txt");

        //FileReader rf = new FileReader(f);

        FileReader rf = null;

        try
        {
            rf = new FileReader(f);
            rf.read();
        } catch (FileNotFoundException fExcption)
        {
            System.out.println(fExcption);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {

        try {
            fun1();
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.out.println(e);
        }finally {
            System.out.println("code ended");
        }
    }
}
