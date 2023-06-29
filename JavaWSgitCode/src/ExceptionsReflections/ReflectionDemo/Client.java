package ExceptionsReflections.ReflectionDemo;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Client {


    public static void StingDemo() throws ClassNotFoundException {


        Class getStringClass = Class.forName("java.lang.String");
        System.out.println(getStringClass);

        System.out.println(getStringClass.getDeclaredConstructors().length);
        System.out.println(getStringClass.getDeclaredFields().length);
        System.out.println(getStringClass.getDeclaredMethods().length);
    }
    public static void PersonDemo() throws ClassNotFoundException , InvocationTargetException,IllegalAccessException, NoSuchMethodException {
        Class getPersonDetails = Class.forName("ExceptionsReflections.ReflectionDemo.Person");
        System.out.println(getPersonDetails.getDeclaredConstructors().length);

        try {

            Constructor ctorParsmsCheck = getPersonDetails.getDeclaredConstructor(int.class, String.class);
            Object p = ctorParsmsCheck.newInstance(23, "santosh");
            System.out.println(p);

            Method m = getPersonDetails.getDeclaredMethod("funMethod");
            System.out.println(m.getReturnType().getSimpleName());
            m.setAccessible(true);
            m.invoke(p);


            Field f = getPersonDetails.getDeclaredField("age");
            f.setAccessible(true);
            System.out.println((int)f.get(p));


        }
        catch (NoSuchMethodException  noSuchMethodException)
        {
            System.out.println(noSuchMethodException.getMessage());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws ClassNotFoundException {
        //StingDemo();

        try     {
            PersonDemo();
        } catch ( Exception e)
        {
            System.out.println(e.getMessage());
        }

    }


}
