package gr.aueb.cf.ch6;

import java.util.Scanner;

/*
This app receives a string sentence from the user and returns
the encrypted and decrypted equivalent (next/previous ASCII characters)
 */

public class EncryptionApp {

    public static void main(String[] args) {
        //declaration
        Scanner in = new Scanner(System.in);
        String input = "";
        //prompt user's input
        System.out.println("Please write your sentence: ");
        input = in.nextLine();
        //call method & print result
        String encryptedS = encryption(input);
        System.out.printf("The encrypted sentence is: %s",encryptedS);
        //call method & print result
        String decryptedS = decryption(input);
        System.out.printf("%nThe decrypted sentence is: %s",decryptedS);
    }
   public static String encryption(String input) {
        String encryption = "";
        //iterate every string character
        for (int i = 0; i < input.length(); i++) {
           char c = input.charAt(i);
           //append the next in line ASCII character
           c += 1;
           encryption += c;
       }
        return encryption;
   }
   public static String decryption(String input) {
       String decryption = "";
       //iterate every string character
       for (int i = 0; i < input.length(); i++) {
           char c = input.charAt(i);
           //append the previous ASCII character
           c -= 1;
           decryption += c;
       }
       return decryption;
   }

}
