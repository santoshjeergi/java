package DesignPatterns.Factory.Demo1;

public class MYSQLQuery implements Query {
    @Override
    public void execute() {
        System.out.println("Mongo Query Exceute");
    }
}
