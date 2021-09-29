package Arrays;


// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class Find_Numbers_Even_Digits {

    public int findNumbers(int[] nums) {

        int count=0;
        int lengthOfDigit=0;
        for(int i=0;i<nums.length;i++){

            int currentValue = nums[i]; //store the current index value
            while(currentValue>0){
                currentValue=currentValue/10;
                lengthOfDigit++;
            }
            if(lengthOfDigit%2==0){
                count++;
            }
            lengthOfDigit=0; //reset the value of this for each index
        }
        return count;
    }
}
