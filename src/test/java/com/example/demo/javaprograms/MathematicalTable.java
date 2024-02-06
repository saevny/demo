package com.example.demo.javaprograms;

import java.util.Scanner;

public class MathematicalTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print it's multiplication table: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + "= " + (n * i));
        }

    }
}
