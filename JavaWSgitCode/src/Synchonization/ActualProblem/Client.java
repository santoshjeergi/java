package Synchonization.ActualProblem;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter(10);
        Adder a = new Adder(c);
        Subtrator s = new Subtrator(c);

        Thread addThread = new Thread(a);

        Thread subThread = new Thread(s);

        addThread.start();
        subThread.start();

        addThread.join();
        subThread.join();
        System.out.println(c.countVal);
    }
}
