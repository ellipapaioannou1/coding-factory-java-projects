package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * An app where a menu is shown in loop, until the user selects exit
 */
public class MenuApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputChoice = 0;
        //menu is shown at least 1 time
        do {
            System.out.println("1. ΕΙΣΑΓΩΓΗ");
            System.out.println("2. ΔΙΑΓΡΑΦΗ");
            System.out.println("3. ΕΝΗΜΕΡΩΣΗ");
            System.out.println("4. ΑΝΑΖΗΤΗΣΗ");
            System.out.println("5. ΕΞΟΔΟΣ");
            System.out.println("ΠΑΡΑΚΑΛΟΥΜΕ ΟΠΩΣ ΕΠΙΛΕΞΕΤΕ ΑΠΟ ΤΙΣ ΠΑΡΑΠΑΝΩ ΕΠΙΛΟΓΕΣ");
            inputChoice = in.nextInt();

            if (inputChoice == 1) {
                System.out.println("ΕΠΙΛΕΞΑΤΕ ΕΙΣΑΓΩΓΗ");
            } else if (inputChoice == 2) {
                System.out.println("ΕΠΙΛΕΞΑΤΕ ΔΙΑΓΡΑΦΗ");
            } else if (inputChoice == 3) {
                System.out.println("ΕΠΙΛΕΞΑΤΕ ΕΝΗΜΕΡΩΣΗ");
            } else if (inputChoice == 4) {
                System.out.println("ΕΠΙΛΕΞΑΤΕ ΑΝΑΖΗΤΗΣΗ");
            } else {
                System.out.println("ΠΑΡΑΚΑΛΟΥΜΕ ΟΠΩΣ ΕΠΙΛΕΞΕΤΕ ΜΙΑ ΑΠΟ ΤΙΣ ΔΙΑΘΕΣΙΜΕΣ ΕΠΙΛΟΓΕΣ");
            }
        } while (inputChoice != 5); //loop breaks when choice is 5

        System.out.println("ΕΠΙΤΥΧΗΣ ΕΞΟΔΟΣ");
    }
}
