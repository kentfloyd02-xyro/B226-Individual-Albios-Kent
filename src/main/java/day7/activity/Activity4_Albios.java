/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day7.activity;
import java.util.Scanner;

public class Activity4_Albios {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
  
        System.out.println("== Kent Dev ==");
        System.out.println("1. Start Game");
        System.out.println("2. Load Game");
        System.out.println("3. Setting");
        System.out.println("4. Exit");
        System.out.print("Enter your choice (1-4): ");
        int choice = input.nextInt();

        if(choice == 1){
            System.out.print("You selected Option 1: Start Game");
        }else if(choice == 2) {
            System.out.print("You selected Option 2: Load Game");  
        }else if(choice == 3) {
            System.out.print("You selected Option 3: Settings");  
        }else if(choice == 4) {
            System.out.print("You selected Option 4: Exit");  
        }else{
            System.out.println("Invalid choice. Please try again.");
        }
    }
}
