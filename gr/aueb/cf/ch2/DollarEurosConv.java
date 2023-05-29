package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DollarEurosConv {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int euros;
        int dollars;

        System.out.println("Please insert amount in euros: ");
        euros = in.nextInt();

        dollars = (int) (euros * 1.18);

        System.out.printf("%d euros = %d dollars", euros, dollars);
    }
}
