package DesignPatterns.Factory.Demo1;

public class MongoQuery implements Query {
    @Override
    public void execute() {
        System.out.println("Mongo Query Exceute");
    }
}
