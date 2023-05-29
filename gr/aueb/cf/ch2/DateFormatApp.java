package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Εισαγωγή 3 ακεραίων (ημέρα-μήνας-έτος) από τον χρήστη και εμφάνιση των αποτελεσμάτων
 * με την μορφή ΗΗ/ΜΜ/ΕΕ
 */

public class DateFormatApp {

    public static void main(String[] args) {

        //Δήλωση μεταβλητών
        Scanner in = new Scanner(System.in);
        int inputDay = 0;
        int inputMonth = 0;
        int inputYear = 0;


        //Εισαγωγή δεδομένων από τον χρήστη
        System.out.println("Please insert day: ");
        inputDay = in.nextInt();
        System.out.println("Please insert month: ");
        inputMonth = in.nextInt();
        System.out.println("Please insert year: ");
        inputYear = in.nextInt();


        //Εκτύπωση αποτελεσμάτων
        System.out.printf("%02d / %02d / %d", inputDay, inputMonth, inputYear % 100);

    }
}
