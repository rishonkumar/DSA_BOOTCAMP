package Recursion;

import java.util.Scanner;

public class Maximum_Array {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        maximumArray(arr, 0);
    }

    static int maximumArray(int[] arr, int index) {

        if(index == arr.length-1){
            return arr[index];
        }

        int Max = maximumArray(arr, index+1);

        return Math.max(Max, arr[index]);
    }
}
