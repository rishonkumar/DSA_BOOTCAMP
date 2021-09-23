package Fundamentals;

import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int max = a;
        if (b > a)
            max = b;
        if (c > max)
            max = c;

        int max1 = Math.max(c, Math.max(a,b));

        System.out.println(max);
        System.out.println(max1);
    }
}
