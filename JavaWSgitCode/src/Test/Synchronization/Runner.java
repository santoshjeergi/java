package Test.Synchronization;

public class Runner {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Adder adder = new Adder(counter);
        Subtractor subtractor = new Subtractor(counter);

        Thread adderThread = new Thread(adder);
        Thread subtractorThread = new Thread(subtractor);

        adderThread.start();
        subtractorThread.start();

       try {
           adderThread.join();
           subtractorThread.join();
       } catch (Exception e)
       {
           e.printStackTrace();
       }

        System.out.println( "count" + counter.getCount());

    }
}
