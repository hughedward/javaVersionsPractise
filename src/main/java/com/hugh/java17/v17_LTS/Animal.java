package com.hugh.java17.v17_LTS;

interface Animal {
}

class Rabbit implements Animal{
    public void run() {
        System.out.println("run");
    }
}

class Bird implements Animal{
    public void fly() {
        System.out.println("fly");
    }
}

