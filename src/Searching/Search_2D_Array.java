package Searching;

import java.util.Arrays;

public class Search_2D_Array {
    public static void main(String[] args) {

        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,56},
        };

        int target = 18;
        int[] ans = search(arr,target); // format to return value {row,col}
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr , int target){

        for(int row=0;row<arr.length;row++){
            for(int col = 0; col<arr[row].length;col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
