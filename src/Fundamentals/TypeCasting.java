package Fundamentals;

import java.util.Scanner;
/*
    Since float is larger than int we can convert it into  float
 */
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num); // It automatically converts into float

        // TYPE CASTING - by user(explict)
        int numb = (int)67.56f;
        System.out.println(numb); //67

        // automatic type promotion in expression
        int a = 257;
        byte b = (byte)a; //max range of byte is 256
        System.out.println(b); // 1  result is remainder of 256 and 257 (257%256=1)

        int number = 'A';
        System.out.println(number); //65
    }
}
