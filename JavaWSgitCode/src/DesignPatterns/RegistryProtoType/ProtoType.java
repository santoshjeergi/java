package DesignPatterns.RegistryProtoType;

public interface ProtoType<T extends Student> {
 T clone();
}
