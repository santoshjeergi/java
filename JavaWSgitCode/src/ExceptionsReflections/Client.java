package ExceptionsReflections;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x / y);
        } catch (ArithmeticException e)
        {
            System.out.println(e);
        } catch (InputMismatchException ex)
        {
            System.out.println(ex + " input is incorrect, reenter valid");
        } finally {
            System.out.println("Code finally is called to cleanup");
        }
        System.out.println("end of code");
    }
}
