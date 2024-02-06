package com.example.demo.javaprograms;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a palindrome: ");
        int n = scanner.nextInt();
        int reverse = 0;
        int temp = n;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        if (temp == reverse) {
            System.out.println(temp + " is a palindrome.");
        } else {
            System.out.println(temp + " is not a palindrome.");
        }
    }
}
