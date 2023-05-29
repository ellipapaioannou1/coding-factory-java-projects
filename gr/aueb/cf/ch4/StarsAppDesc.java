package gr.aueb.cf.ch4;

import java.util.Scanner;

public class StarsAppDesc {

    public static void main(String[] args) {
        //n to 1 stars eg *** then ** then * etc
        Scanner in = new Scanner(System.in);
        int nStars = 0;

        System.out.println("Please insert number of stars (*)");
        nStars = in.nextInt();

        for (int i=1;i<=nStars;i++) {
            for (int j=i; j < nStars; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
