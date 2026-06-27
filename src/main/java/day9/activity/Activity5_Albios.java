/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day9.activity;
import java.util.Scanner;
/**
 *
 * @author ktagl
 */
public class Activity5_Albios {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //prog 1
        System.out.print("Enter a number to sum: ");
        int num = input.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
            System.out.println("i = " + i + ", N = " + sum);
        }
        System.out.println("Final Sum: " + sum);
        //end prog1
        
        //prog2
        System.out.print("Enter a number to product: ");
        int num2 = input.nextInt();
        int product = 1;
        
        for (int i = 1; i <= num2 ; i++) {
            product *= i;
            System.out.println("i = " + i + ", N = " + product);
        }
        System.out.println("Final Product: " + product);
        //end prog2
        
        //prog3
        System.out.print("Enter starting number: ");
        int startNumber = input.nextInt();

        System.out.print("Enter common difference: ");
        int commonDifference = input.nextInt();

        System.out.print("N = : ");
        int num3 = input.nextInt();

        int current = startNumber;
        int sum2 = 0;

        for (int i = 1; i <= num3; i++) {
            System.out.print(current);
            sum2 += current;
            if (i < num3) {
                System.out.print(" + ");
            }
            current += commonDifference;
        }
        System.out.println(" = " + sum2);        
        //end prog3
        
        //prog4
        System.out.print("Enter sum starting number: ");
        int startNumber2 = input.nextInt();

        System.out.print("Enter sum common difference: ");
        int commonDifference2 = input.nextInt();

        System.out.print("sum N = : ");
        int num4 = input.nextInt();
        
        int current2 = startNumber2;
        int sum3 = 0;
        long product2 = 1;

        // Print Sum
        System.out.print("Sum: ");
        current = startNumber;

        for (int i = 1; i <= num4; i++) {
            System.out.print(current2);
            sum3 += current2;

            if (i < num4) {
                System.out.print(" + ");
            }

            current2 += commonDifference2;
        }

        System.out.println(" = " + sum3);

        // Print Product
        System.out.print("Product: ");
        current2 = startNumber2;

        for (int i = 1; i <= num4; i++) {
            System.out.print(current2);
            product2 *= current2;

            if (i < num4) {
                System.out.print(" * ");
            }

            current2 += commonDifference2;
        }

        System.out.println(" = " + product2);
        //end prog4
    }
}
