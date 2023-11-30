package org.example;

public class InterfaceANewImpl implements InterfaceA {

    @Override
    public void defaultMethod() {
        InterfaceA.super.defaultMethod();
    }
}
