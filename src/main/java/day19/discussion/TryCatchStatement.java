/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day19.discussion;

import java.util.Scanner;

/**
 *
 * @author ktagl
 */
public class TryCatchStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("** Load Registration **");
            System.out.println("    [1] Unli Text");
            System.out.println("    [2] Unli Call");
            System.out.println("    [3] Unli Call N Text");
            System.out.println("    [4] Check Balance");
            System.out.println("    [5] Exit");
            System.out.print("Enter choice: ");
            try {
                int mainMenuChoice = scanner.nextInt();
                scanner.nextLine();
                switch (mainMenuChoice) {
                    case 1:
                        System.out.println("Enjoy Unli Text");

                        break;
                    case 2:
                        System.out.println("Enjoy Unli Call");

                        break;
                    case 3:
                        System.out.println("Enjoy Unli Call N Text");

                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid Input! Please enter numeric only!. Exception occur: " + e.getMessage());
                scanner.nextLine();
            }
        }

    }
}
