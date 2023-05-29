package gr.aueb.cf.ch1;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = 0;


        System.out.println("Please choose from the following:\n 1. Intro\n 2. Delete\n 3. Search\n 4. Update\n 5. Exit\n Input number:");
        num = in.nextInt();

        System.out.println("You selected option " + num);





    }
}
