package gr.aueb.cf.ch4;

import java.util.Scanner;

public class StarsNN {

    public static void main(String[] args) {
        //n rows with n stars each
        Scanner in = new Scanner(System.in);
        int nStars = 0;

        System.out.println("Please insert number of stars (*)");
        nStars = in.nextInt();

        for (int i=1;i<=nStars;i++) {
            for (int j = 1; j <= nStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
