package com.hugh.java17.v21;

import java.util.Objects;

public class Test01 {
    private String name;
    private int age;

    public Test01() {
    }

    public Test01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Test01 test01 = (Test01) o;
        return age == test01.age && Objects.equals(name, test01.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Test01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
