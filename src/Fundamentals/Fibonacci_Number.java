package Fundamentals;

// Find the nth fibo number

import java.util.Scanner;

public class Fibonacci_Number {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= n){
            int nextNumber = a+b;
            a = b;
            b = nextNumber;
            count++;
        }
        System.out.println(b);
    }
}
