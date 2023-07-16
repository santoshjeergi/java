package DesignPatterns.Factory.Demo1;

public class Client {

    public static void main(String[] args) {

        String s = new String("Mongo");
        Database d = null;

        try {
        if( s.equals("SQL")) {
            d = new MySQLDB();
        } else if (s.equals("Mongo")){
            d = new MongoDB();
        } else {
            System.out.println("Invalied DB");
                throw new IllegalArgumentException("Invalid database");
        }
        }catch (IllegalArgumentException ex)
        {
            System.out.println(ex);
        } catch(Exception ex)
        {
                System.out.println(ex);
        }
        finally {
            System.out.println("Execuete irrespective of success or failure");
        }
        d.work();

    }
}
