package com.hugh.java17.v15;

/**
 * 只希望 Dog 和 Cat 可以继承
 * 有点像是遗书
 */
public sealed class Animal permits Dog, Cat {
    public void eat(){

    }
}
