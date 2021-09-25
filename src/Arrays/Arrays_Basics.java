package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Basics {
    /*
        SYNTAX
        datatype[] variable = new datatype[size];

     */

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        int[] arr; //declaration of array. arr is getting defined in the stack
        arr = new int[5]; //initialisation. actually here object is being created in the memory(heap)
        // new keyboard - is used to create a OBJECT(in the heap memory)

        // input using for loops
        for(int i=0;i<arr.length;i++){
            arr[i] = sn.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

        //for each loop
        for(int num : arr){ //for every element in array, print the element
            System.out.println(num + " "); // here num represent element in the array
        }

        System.out.println(Arrays.toString(arr)); // [1,2,3,4,5]

        

    }

}
