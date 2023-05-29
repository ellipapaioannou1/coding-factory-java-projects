package gr.aueb.cf.ch4;

import java.util.Scanner;

public class StarsAppAsc {

    public static void main(String[] args) {
        //1 to n stars eg * then ** then *** etc
        Scanner in = new Scanner(System.in);
        int nStars = 0;

        System.out.println("Please insert number of stars (*)");
        nStars = in.nextInt();

        for (int i=1;i<=nStars;i++) {
            for (int j =1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
