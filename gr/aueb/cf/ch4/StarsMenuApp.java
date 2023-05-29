package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * App that prompts user to select number of star.Then print a menu with 6 different choices. Then, according to user's choice, a selected number
 * of stars are shown
 */
public class StarsMenuApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int nStars = 0;
        int choice = 0;

        System.out.println("Παρακαλούμε όπως επιλέξετε (*)");
        nStars = in.nextInt();

        do {
            menu(); //call method
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    starsHorizontally(nStars); //call method
                    break;
                case 2:
                    starsRowsN(nStars); //call method
                    break;
                case 3:
                    starsVertically(nStars); //call method
                    break;
                case 4:
                    starsDesc(nStars); //call method
                    break;
                case 5:
                    starsAsc(nStars); //call method
                    break;
                case 6:
                    System.out.println("Επιτυχής έξοδος");
                    break;
                default:
                    System.out.println("Παρακαλούμε όπως επιλέξετε από το 1-6"); //in case of invalid num eg -1, 100 etc
            }
        } while (choice != 6); //breaks if user insert 6
    }

    public static void menu() {
        System.out.println("Παρακαλούμε όπως επιλέξετε από τα παρακάτω: ");
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 – n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n – 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    public static void starsHorizontally(int n) {
        //n stars horizontally
        for (int i=1;i<=n;i++) {
            System.out.print("*");
        }
    }

    public static void starsRowsN(int n) {
        for (int i=1;i<=n;i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void starsVertically(int n) {
        //n stars vertically
        for (int i=1;i<=n;i++) {
            System.out.println("*");
        }
    }
    public static void starsDesc(int n) {
        //n to 1 stars eg *** then ** then * etc
        for (int i=1;i<=n;i++) {
            for (int j=i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
    public static void starsAsc(int n) {
        //1 to n stars eg * then ** then *** etc
        for (int i=1;i<=n;i++) {
            for (int j =1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }


}
