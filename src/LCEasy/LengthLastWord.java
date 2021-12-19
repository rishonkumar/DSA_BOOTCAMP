package LCEasy;
//https://leetcode.com/problems/length-of-last-word/
/*
s = "Hello World -> 5
s = "to the moon   " -> 4
 */
public class LengthLastWord {

    public static int lengthOfLastWord(String s) {
        int length = 0;
        for(int i=s.length()-1 ; i>=0 ; i--) {
            if(s.charAt(i) != ' ') { //if letter is found count
                length++;
            }
            else {
                //it's a white space
                //did we already count the length if yes then we found the last word else
                // keep skipping the while space
                if(length > 0)
                    return length;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
