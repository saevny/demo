package com.example.demo.javaprograms;

import java.util.Scanner;

public class PrintReverseOfNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print its reverse: ");
        int n = scanner.nextInt();
        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        System.out.println("The reverse of " + n + " is: " + reverse);
    }
}
