package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * The following app checks whether the input year is a leap year
 */
public class LeapYearApp {

    public static void main(String[] args) {

        //Define variables
        Scanner in = new Scanner(System.in);
        int inputYear = 0;

        //Prompt user to input year
        System.out.println("Please insert year: ");
        inputYear = in.nextInt();

        //A leap year is evenly divided by 400 and 100
        if (inputYear % 4 == 0) {
            if (inputYear % 100 == 0) {
                if (inputYear % 400 == 0) {
                    System.out.printf("%d is a leap year", inputYear);
                } else {
                    System.out.printf("%d is not a leap year", inputYear);
                }
            } else {
                System.out.printf("%d is a leap year", inputYear);
            }
        } else {
            System.out.printf("%d is not a leap year", inputYear);
        }
    }
}
