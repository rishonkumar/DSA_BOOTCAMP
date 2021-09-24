package Fundamentals;

import java.util.Scanner;

public class Armstrong_Number {
    //Print 3 digit armstrong number
    /*
        a=153
        1+125+27 = 153
     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(isArmstrong(n));

        //Print all 3 digit armstrong number
        for (int i=100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.println(i+" ");
            }
        }
    }

    static boolean isArmstrong(int n){

        int orginal = n;
        int sum = 0;

        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        // return sum == orginal;
        if(sum == orginal){
            return true;
        }
        return false;
    }
}
