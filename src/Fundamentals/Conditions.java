package Fundamentals;

public class Conditions {
    public static void main(String[] args) {

        /*
            Syntax of if statements
            if(boolean expression T or F)
                //body
            else
                //do this
         */
        int salary = 24500;
//        if (salary > 1000) {
//            salary = salary + 2000;
//        } else {
//            salary = salary + 1000;

        // Multiple If statement
        if (salary > 10000) {
            salary += 2000;
        } else if (salary > 24000) {
            salary += 300;
        } else {
            salary += 30;
        }
        System.out.println(salary);
    }

}

