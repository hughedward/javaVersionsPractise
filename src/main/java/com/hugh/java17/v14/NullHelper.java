package com.hugh.java17.v14;

public class NullHelper {
    public static void main(String[] args) {
        new Car().engine.machine.start();
    }
}

class Car{
    public Engine engine;
}
class Engine {
    public Machine machine;
}

class Machine{
    public void start(){
        System.out.println("running");
    }
}