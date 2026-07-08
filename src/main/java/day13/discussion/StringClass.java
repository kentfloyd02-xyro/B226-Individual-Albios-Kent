/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day13.discussion;
import java.util.Scanner;
/**
 *
 * @author ktagl
 */
public class StringClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Display the exit confirmation menu
        System.out.println("Are you sure that you want to exit? \n\t[Y] Yes \n\t[N] No");
        
        // Prompt the user for their choice
        System.out.print("Enter your choice: ");    
        String choice = scanner.nextLine(); // Read the user's input as a string
        
        // Check the user's choice (ignoring case sensitivity)
        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("Exiting..."); // If user enters Y or y
        } else if(choice.equalsIgnoreCase("n")){
            System.out.println("Go Back to Main Menu"); // For any other input
        } else {
            System.out.println("Invalid Input!");
        }
        
        scanner.close(); // Close the Scanner
        /*
        int num = 10; // fixed value
        
        String word = "Hello";
        System.out.println( word.charAt(0));
        System.out.println(word.charAt(2));
        
        System.out.println("Enter Gender: ");
        String gender = "Male"; //The String value
        char genderPrefix = gender.charAt(0);
        System.out.println(genderPrefix);
       // System.out.println(gender.charAt(0));
         */
 /*
        String word = "Hello java";
        System.out.println(word.length());
        
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i));
        }
         */
 /*
       String country = "Philippines";
       System.out.println(country.toLowerCase());
       System.out.println(country.toUpperCase());
         */
 /*
        // concat () +
        String firstName = "Kent ";
        String lastName = "Mahala Siya";
        
        //before
        System.out.println(firstName.concat(lastName));
        //now
        System.out.println(firstName + lastName);
        
         */
 /*
 //equals ()
        String username = "Winter";
        String lgoinUsername = "Winter123";
        
        System.out.println(username.equals(lgoinUsername));
        

         */
    }
}
