package Searching;

public class Binary_Search {

    public static void main(String[] args) {

        int[] arr = {-18,-12,-8,-1,0,34,56,67,78,89,456,678};
        int target = 56;
        System.out.println(binarySearch(arr,target));
    }

    //return the index
    //return -1 if it does not exist

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the element
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
