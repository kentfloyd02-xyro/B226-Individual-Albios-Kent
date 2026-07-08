/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day7.discussion;
import java.util.Scanner;
/**
 *
 * @author ktagl
 */
public class UserInput {
    
    public static void main(String[] args) {
        // create object of scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = input.nextLine(); // String input
        
        System.out.print("Enter age: ");
        int age = input.nextInt(); // Integer input
        
        System.out.print("Enter Salary: ");
        double salary = input.nextDouble(); // Double input
        
        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
