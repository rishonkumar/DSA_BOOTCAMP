package Fundamentals;

public class Swap {
    public static void main(String[] args) {
        int a = 10, b = 20;
        swap(a, b);
        System.out.println(a + " " + b); //It will not swap
    }

    static void swap(int a, int b) {

        int temp = a;
        a = b;
        b = temp;
    }
}
