package com.korebit.logic;

public class TestClass {
    public static void main(String[] args) {
        new Person("John").sayHello();
        new Person("Alice").sayHello();
    }

    public static class Person {
        String name;

        Person(String n) {
            name = n;
        }

        void sayHello() {
            System.out.println("Hello, " + name + "!");
        }
    }
}
