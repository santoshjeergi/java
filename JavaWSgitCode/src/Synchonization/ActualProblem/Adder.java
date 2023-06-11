package Synchonization.ActualProblem;

public class Adder implements Runnable{

    private Counter counter;

    Adder( Counter c)
    {
        this.counter = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {

            counter.countVal +=i;
        }

    }
}