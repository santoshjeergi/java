package Test.Designpatterns.practiceSingleton;

import DesignPatterns.Singleton.DBFDemo;

public class Thread1 implements Runnable{
    DBFDemo dbfDemo;
    @Override
    public void run() {
        dbfDemo = DBFDemo.getInstance();
        System.out.println("Thread1:" + dbfDemo);
    }
}
