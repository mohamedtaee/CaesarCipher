/*
Project: Caesar Cipher
Names: Mohamed Mohamed, Cassandra Palmer, Elizabeth Rosenbloom
Description: This program can encode or decode a message using a Caesar Cipher.
Course: CSIS-1400
*/

import java.util.Scanner;


public class CaesarCipher {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userChoice;
      int caesarShift;
      String inputMessage;
      String outputMessage;
      
      //receiving input
      System.out.println("Please choose option by typing: Encode, Decode, Exit");
      userChoice = scnr.next();
      
         if (userChoice.equals("Encode") || userChoice.equals("Decode")){
               System.out.println("Please enter shift number:");
               caesarShift = scnr.nextInt();
      
               System.out.println("Please enter a message:");
               inputMessage = scnr.next();
         }
         else if (userChoice.equals("Exit")){
            System.out.println("Goodbye!");
         }
         else{
            System.out.println("Error");
         }
      
      
      //encoding a message
      while (userChoice.equals("Encode")){ 
      
      }
      
      //decoding a message
      while (userChoice.equals("Decode")){
      
      }
      
      
 }
}