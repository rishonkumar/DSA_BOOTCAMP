package Recursion;

import java.util.Scanner;

public class DisplayArray {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n; i++){
            arr[i] = scn.nextInt();
        }

        displayArray(arr,0);
    }

    public static void displayArray(int[]arr, int index) {

        if(index == arr.length){
            return;
        }
        System.out.println(arr[index]);
        displayArray(arr,index+1);
    }
}
