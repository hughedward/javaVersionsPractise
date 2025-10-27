package com.hugh.java17.v15;

/**
 * 只是一代
 * 有点像嬴政，有点像现在的社会
 */
public sealed class Dog extends Animal permits JinMao{
    @Override
    public void eat() {
        super.eat();
        System.out.println("hhh");
    }
}
