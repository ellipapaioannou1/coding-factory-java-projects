package gr.aueb.cf.miniprojects;

import java.util.Scanner;

public class SeatingPlannerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        boolean[][] arr =  seatingTable(30, (char) 12);


        System.out.println("Please select an option: ");

        while (true){
            System.out.println("For new booking, press 1");
            System.out.println("For canceling a booking, press 2");
            choice = in.nextInt();
            seatingTable(30, (char) 12);


            switch (choice) {


                case 1:
                    book(in);

                    break;
                case 2:
                    System.out.println("Select a seat: ");
                    cancel(in);
                    printSeating();
                    break;
                default:
                    System.out.println("Invalid choice, please try again!");
                    break;
            }
        }

    }

    public static void book(Scanner in) {
        int bookRow;
        boolean[][] array = new boolean[30][12];
        System.out.println("Select row (1-30): ");
        bookRow = in.nextInt() -1;
        System.out.println("Select column (A-L): ");
        char bookCol = in.next().toUpperCase().charAt(0);

        int rowPosition = bookRow - 1;
        int columnPosition = bookCol - 'A';

        if (isEmpty(rowPosition,columnPosition)) {
            array[rowPosition][columnPosition] = true;
            printSeating();
        } else {
            System.out.println("Seat: " + bookCol + bookRow + " is already booked!");
        }
    }

    public static void cancel(Scanner in) {
        int bookRow;
        boolean[][] array = new boolean[30][12];
        System.out.println("Select row (1-30): ");
        bookRow = in.nextInt() -1;
        System.out.println("Select column (A-L): ");
        char bookCol = in.next().toUpperCase().charAt(0);

        int rowPosition = bookRow - 1;
        int columnPosition = bookCol - 'A';

        if (!isEmpty(rowPosition,columnPosition)) {
            array[rowPosition][columnPosition] = false;
            System.out.println("Booking: " + bookRow + bookCol + "is canceled.");
        } else {
            System.out.println("Invalid seat/Seat is empty");
        }



    }

    public static boolean isEmpty(int rows, int cols) {
        boolean[][] array = new boolean[rows][cols];
        int rowPosition = rows - 1;
        char columnPosition = (char) (cols - 'A');

        for (int i =0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!array[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean[][] seatingTable(int rows, char cols) {
        boolean[][] array = new boolean[rows][cols];

        for (int i =0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                char column = (char) ('A' + j);
                int row = i + 1;
                array[i][j] = false;
                }
            }
        return array;
    }


    public static void printSeating() {
        boolean[][] array = new boolean[30][12];

        for (int i =0; i < 30; i++) {
            for (int j =0; j < 12; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}







