package com.example.demo.javaprograms;

public class MultiplyNaturalNumbers {
    public static void main(String[] args) {

        int j = 1;
        for (int i = 1; i <= 10; i++) {

            j *= i;
        }
        System.out.println("multiplication of first 10 natural numbers is " + j);
    }
}
