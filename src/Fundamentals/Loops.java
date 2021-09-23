package Fundamentals;

public class Loops {

    public static void main(String[] args) {

        //while loop
        /*
            while(condition){
                //body
             }
         */
        int count = 1;
        while (count != 5) {
            System.out.println("Using while loop " + count);
            count++;
        }
        // If u don't know how many times a loop will run then use while loop

        //for loop

        /*
            for(initialisation; condtion; increment/decrement)
                //body
         */

        for (int countF = 1; countF != 5; countF++) {
            System.out.println(countF);
        }

        // do-while
        /*
           do{
              body
           }while(condition)
         */
        //LOOP will excute atleast once
        int number = 1;
        do {
            System.out.println(number);
            number++;
        } while (number <= 5);
    }

}
