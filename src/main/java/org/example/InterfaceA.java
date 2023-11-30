package org.example;

public interface InterfaceA {
    static String getinfo() {
        return "Info";
    }

    default String getDefault() {
        return "Default";
    }

    default void defaultMethod() {
        System.out.println("Inside default method");
    }
}
