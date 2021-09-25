package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer>list = new ArrayList<>(10);
//        list.add(67);
//        list.add(453);
//        list.add(3456);
//        list.add(4343);
//
//        System.out.println(list.contains(34));
//
//        list.set(0,88); //update the index 0 with 67
//        list.remove(2);

        //input
        for(int i=0;i<5;i++){
             list.add(in.nextInt());
        }

        //Get item at any Index
        for(int i=0;i<5;i++){
            System.out.println(list.get(i)); //pass index here
        }

    }
}
