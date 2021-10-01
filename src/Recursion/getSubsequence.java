package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class getSubsequence {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> res = subsequences(str);
        System.out.println(res);
    }

    //bc -> [--,-c,b-,bc]
    //abc -> [---,--c,-b-,-bc,a--,a-c,ab-,abc]
    public static ArrayList<String> subsequences(String str){

        if(str.length() == 0){
            ArrayList<String>bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0); //a
        String str2 = str.substring(1); //bc
        ArrayList<String> Smallres = subsequences(str2); // [--,-c,b-,bc]

        ArrayList<String> finalRes = new ArrayList<>();
        for(String rstr : Smallres){
            finalRes.add(""+rstr);
            finalRes.add(ch+rstr);
        }
        return finalRes;
    }
}
