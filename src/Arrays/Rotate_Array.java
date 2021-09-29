package Arrays;

/*
 Sample Input 1:
1
7
1 2 3 4 5 6 7
2
Sample Output 1:
3 4 5 6 7 1 2
Sample Input 2:
2
7
1 2 3 4 5 6 7
0
4
1 2 3 4
2
Sample Output 2:
1 2 3 4 5 6 7
3 4 1 2
 */

public class Rotate_Array {

    public static void RotateArray(int[] arr, int d) {

        int n = arr.length;
        if (n == 0) return;

        if (d >= n && n != 0) {
            d = d % n;
        }

        reverse(arr, 0, n - 1); //First part
        reverse(arr, 0, n - d - 1); //second part
        reverse(arr, n - d, n - 1); //Third part

    }

    public static void reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        RotateArray(arr,2);
        printArray(arr,arr.length);
    }
}
