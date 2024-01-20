package Test.Designpatterns.RegistryProtoType;

public interface Prototype <T extends Student>{
    T clone();
}
