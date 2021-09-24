package Fundamentals;

import java.util.Scanner;

public class Functions {

    /*
           return_type name(arguments){
               // body
               return statement

           }
     */

    public static void main(String[] args) {
        sum(); //calling the function
        int ans = sum2();
        System.out.println(ans);

        int ans1 = sum3(30,50);
        System.out.println(ans1);


    }

    // return the sum
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 1st Number ");
        int num1 = in.nextInt();
        System.out.println("Enter the 2nd Number ");
        int num2 = in.nextInt();
        int sum2 = num1 + num2;
        return sum2;
    }

    //pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 1st Number ");
        int num1 = in.nextInt();
        System.out.println("Enter the 2nd Number ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }



}
