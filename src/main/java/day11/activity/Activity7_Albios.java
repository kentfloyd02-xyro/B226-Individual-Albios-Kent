/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day11.activity;

import java.util.Scanner;

/**
 *
 * @author ktagl
 */
public class Activity7_Albios {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] num = new int[5];
        int sum = 0;

        System.out.println("Enter 5 numbers ");
        for (int i = 0; i < num.length; i++) {
            System.out.print("Numbers " + (i + 1) + ": ");
            num[i] = input.nextInt();
            sum += num[i];
        }

        System.out.println("\n You entered: ");
        for (int i = 0; i < num.length; i++) {
            System.out.println("Index" + i + ": " + num[i]);
        }

        double ave = (double) sum / num.length;

        int highest = num[0];
        int lowest = num[0];

        for (int i = 0; i < num.length; i++) {
            highest = Math.max(highest, num[i]);
            lowest = Math.min(lowest, num[i]);
        }

        System.out.println();
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + ave);
        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);
    }
}
