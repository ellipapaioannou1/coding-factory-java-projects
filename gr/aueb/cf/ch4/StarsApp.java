package gr.aueb.cf.ch4;

import java.util.Scanner;

public class StarsApp {

    public static void main(String[] args) {

        //n stars horizontally
        Scanner in = new Scanner(System.in);
        int nStars = 0;

        System.out.println("Please insert number of stars (*)");
        nStars = in.nextInt();

        for (int i=1;i<=nStars;i++) {
            System.out.print("*");
        }

    }
}
