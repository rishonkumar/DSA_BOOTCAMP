package Arrays;
import java.util.Arrays;

public class Pair_Sum {


    //BRUTE FORCE APPROACH
    public static void pariSum(int[] arr , int sum){

        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length; j++){
                if(arr[i] + arr[j] == sum){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }

    // TWO POINTER

    public static void pairSumbetter(int[] arr, int sum){


        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;

        while(i<j){

            if(arr[i] + arr[j] > sum){
                j--;
            }
            else if(arr[i] + arr[j] < sum){
                i++;
            }
            else{
                System.out.println(arr[i] + " " + arr[j]);
                i++;
                j--;
            }
        }
    }



    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        pariSum(arr,6);
        pairSumbetter(arr,6);

    }
}
