/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8.discussion;

import java.util.Scanner;

public class AgeClassificationNested {

    public static void main(String[] args) {
        /* Program Requirement: Age Classification with Nested If Statement
        
        -> Input: Age (integer) from the user using the Scanner
        
        -> Processing / Logic: 
            Age: 0 - 12 -> Child 
                Age: 0 - 5 ->  Specifically, Toddler
                Age: 6 - 12 ->  Specifically, Pre-Teen
            Age: 13 - 19 -> Teenager
                Age: 13 - 15 ->  Specifically, Eary Teen
                Age: 16 - 19 ->  Specifically, Late Teen
            Age: 20 - 59 -> Adult
                Age: 20 - 35 ->  Specifically, Young Adult
                Age: 36 - 59 ->  Specifically, Middle-Aged
            Age: 60 - 120 -> Senior Citizen
                Age: 60 - 75 ->  Specifically, Young Senior
                Age: 76 - 120 ->  Specifically, Elderly
            Invalid Age -> Invalid Input
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = input.nextInt();
        // Validation

        if (age >= 0 && age <= 120) {
            if (age <= 12) { // 0 - 12  - outer if 
                System.out.println("You are a child");
                if (age <= 5) { // toddler - inner if
                    System.out.println("Specifically, you are Toddler.");
                } else {
                    System.out.println("Specifically, you are Pre-Teen.");
                }
            } else if (age <= 19) { // 13 - 19
                System.out.println("You are teenager");
            } else if (age <= 59) { // 20 - 59
                System.out.println("You are adult");
            } else if (age <= 120) { // 60 - 120
                System.out.println("You are senior citizen");
            }
        } else {
            System.out.println("Invalid Age Entered.");
        }

        // alt + shift + f
        // code minimization
    }
}
