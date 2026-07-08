/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8.discussion;

import java.util.Scanner;


public class LoginProgram {
    // User Login Program
    public static void main(String[] args) {
        // Create Scanner object to accept input from the user
        Scanner input = new Scanner(System.in);
        
        // Predefined username and password (hardcoded for demo purposes)
        String username = "admin";
        String password = "admin123";
        
        System.out.println("* Login *");   
        System.out.print("Enter username: "); // Ask user for username
        String loginUsername =  input.nextLine(); // Read user input and stores it to loginUsername variable
        System.out.print("Enter password: "); // Ask user for password
        String loginPassword = input.nextLine(); // Read user input and stores it to loginPassword variable
        
        // Check if both username and password match the predefined values
        if (username.equals(loginUsername) && loginPassword.equals(password)) {
            System.out.println("\nLogin successful! " + "Welcome, " + username); 
        } else {
            System.out.println("\nLogin Failed. Invalid username or password.");
        }
        
        // close the scanner
        input.close();
    }
}
