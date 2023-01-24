package org.example;

public interface DefaultStaticExampleInterface {
    default void show(){
        System.out.println("In java 8 default method - DefaultExampleInterface ");
    }
    static void display(){
        System.out.println("In default static example interface I");
    }
}
