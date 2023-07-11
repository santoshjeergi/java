package DesignPatterns.RegistryProtoType;

import java.rmi.registry.Registry;
import java.util.HashMap;
//this can also be singleton, as there needs to be single instance;

public class StudentRegistry {
    private HashMap<String, Student> registry = new HashMap<>();


    static StudentRegistry regRef = new StudentRegistry();

    public void fillRegistry(String key, Student sproto)
    {
        registry.put(key, sproto);
    }

    public Student getStudentFromRegistry(String key)
    {
        return registry.get(key);
    }
}
