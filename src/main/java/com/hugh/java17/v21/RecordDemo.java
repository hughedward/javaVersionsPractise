package com.hugh.java17.v21;

// 也是新特性
public class RecordDemo {
    public static void main(String[] args) {
        Student stu = new Student("hugh", 18);
        print(stu);
    }
    static void print(Object obj){
        if(obj instanceof Student(String name, int age)){
            System.out.println("name: "+ name);
            System.out.println("age: "+ age);
        }
    }
}



record Student(String name, int age) {

}
