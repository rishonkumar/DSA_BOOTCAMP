package Fundamentals;

// two function with same name

public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("Rishon kumar Rahi");
        fun("Rishon",21);
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }

    static void fun(String name , int a){
        System.out.println(name + a);
    }

}
