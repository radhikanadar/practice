package org.example;

public interface InterfaceA {
    static String getinfo() {
        return "Info";
    }

    default String getDefault() {
        return "Default";
    }
}
