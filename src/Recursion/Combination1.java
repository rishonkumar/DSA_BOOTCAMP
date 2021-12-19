package Recursion;
/*
// https://nados.pepcoding.com/content/eb9863ac-63ac-4b94-881f-0aeb24df0985/0c54b191-7b99-4f2c-acb3-e7f2ec748b2a/7fdb0602-0ac9-4484-aff9-a898aed5cd28/f74cfd53-06b7-402e-9065-3f84ef402395/082986ae-d618-4a59-9ab3-6d79056679a4/question/be1b7a05-682c-4014-a963-ce379dfa8b14
5
3
iii--
ii-i-
ii--i
i-ii-
i-i-i
i--ii
-iii-
-ii-i
-i-ii
--iii

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Combination1 {

    public static void combinations(int cb, int tb, int ssf, int ts, String asf){

        if(cb > tb){
            if(ssf == ts)
                System.out.println(asf);
            return;
        }

        combinations(cb+1 , tb , ssf+1 , ts , asf + "i");
        combinations(cb+1 , tb , ssf , ts , asf + "-");
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nboxes = Integer.parseInt(br.readLine());
        int ritems = Integer.parseInt(br.readLine());
        combinations(1, nboxes, 0, ritems, "");
    }
}
