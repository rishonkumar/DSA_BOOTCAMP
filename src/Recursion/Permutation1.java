package Recursion;
// https://nados.pepcoding.com/content/eb9863ac-63ac-4b94-881f-0aeb24df0985/0c54b191-7b99-4f2c-acb3-e7f2ec748b2a/7fdb0602-0ac9-4484-aff9-a898aed5cd28/f74cfd53-06b7-402e-9065-3f84ef402395/082986ae-d618-4a59-9ab3-6d79056679a4/question/2cac43ad-2b8f-403e-a23c-3a08d267c58a
//Permutation1
public class Permutation1 {

    public static void permutations(int[] boxes, int ci, int ti){

        if(ci > ti) {
            for (int i=0 ; i<boxes.length ; i++) {
                System.out.print(boxes[i]);
            }
            System.out.println();
            return;
        }

        for(int i=0 ; i<boxes.length ; i++) {
            if(boxes[i] == 0) {
                //not visited then add the cuurent value
                boxes[i] = ci;
                permutations(boxes , ci+1 , ti);
                boxes[i] = 0;
            }
        }
    }
}
