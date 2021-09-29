package Searching;

public class Linear_Search {

    public static void main(String[] args) {
        int[] nums = {23,34,56,8,32,45,654,33};
        int target = 56;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }

    //search in array: return the index if item found else return -1
    static int linearSearch(int[]arr, int target){

        if(arr.length==0)
            return -1;

        //run a for loop
        for(int i=0;i<arr.length;i++){
            //check for element at every index if it is = target
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
