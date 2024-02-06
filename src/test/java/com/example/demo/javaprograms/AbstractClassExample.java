package com.example.demo.javaprograms;

import java.util.Scanner;

abstract class FirstAbstract {
    //abstract class can have abstract methods and concrete methods
    public void commonMethod() {
        System.out.println("This is First abstract class method.");
    }
  abstract public void abMethod();
}

abstract class SecondAbstract {
    public void commonMethod() {
        System.out.println("This is Second abstract class method.");
    }
}

class AbstractClassExample extends FirstAbstract {
    @Override
    public void commonMethod() {
        System.out.println("This is the common method.");
    }

    @Override
    public void abMethod() {
        System.out.println("Implemented abMethod.");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FirstAbstract obj = new AbstractClassExample();
        obj.commonMethod();
        obj.abMethod();
    }
}
