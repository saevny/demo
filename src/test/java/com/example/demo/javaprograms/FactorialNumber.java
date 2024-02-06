package com.example.demo.javaprograms;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to get it's factorial: ");
        int  n = sc.nextInt();
        long factorial = 1;
        for (int i = 2; i <= n; i++) {

            factorial *= i;
        }
        System.out.println("factorial of given number " + n + " is: " + factorial);
    }
}
