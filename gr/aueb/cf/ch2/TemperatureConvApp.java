package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατροπή ακέραιας τιμής θερμοκρασίας από Fahrenheit σe Celsius
 */

public class TemperatureConvApp {

    public static void main(String[] args) {

        //Δήλωση μεταβλητών
        Scanner in = new Scanner(System.in);
        int inputTemp = 0;
        int tempCels = 0;

        //Εισαγωγή ακεραίου από τον χρήστη
        System.out.println("Please insert temperature (in Fahrenheit)");
        inputTemp = in.nextInt();

        //Υπολογισμός θερμοκρασίας σε  βαθμούς κελσίου βάσει του τύπου 5 * (F-32) / 9
        tempCels = 5 * (inputTemp - 32 ) / 9;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("%,d degrees Fahrenheit = %,d degrees Celsius", inputTemp, tempCels);

    }
}
