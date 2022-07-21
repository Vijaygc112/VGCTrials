package com.basic;

interface TestIntt{
    void printHelloWorld();
}

public class InterfaceTry implements TestIntt {

    public static void main(String[] args) {
        InterfaceTry interfaceTry = new InterfaceTry();
        interfaceTry.printHelloWorld();
    }

    @Override
    public void printHelloWorld() {
        System.out.println("Test");
    }
}
