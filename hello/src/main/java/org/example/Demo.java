package org.example;

public class Demo {

    public static void main(String args[]) {
        System.out.printf(org.example.InterfaceA.getinfo());
        org.example.InterfaceANewImpl newImpl = new org.example.InterfaceANewImpl();
        System.out.printf(newImpl.getDefault());

    }
}
