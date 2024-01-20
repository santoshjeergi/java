package Test.Designpatterns.practiceSingleton;

public class Client {

    public static void main(String[] args) {
        Thread first1 = new Thread(new Thread1());
        Thread first2 = new Thread(new Thread2());
        first1.start();
        first2.start();
        try {
            first1.join();
            first2.join();
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
