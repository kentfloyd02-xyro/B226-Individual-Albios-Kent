/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day8.activity;

import java.util.Scanner;

/**
 *
 * @author ktagl
 */
public class MiniActivity_Albios {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int Age = input.nextInt();

        if (Age >= 0 && Age <= 120) {

            if (Age <= 12) {
                System.out.println("You are a Child");

                if (Age <= 5) {
                    System.out.println("Specifically, You are Toddler");
                } else {
                    System.out.println("Specifically, You are Pre-teen");
                }
            } else if (Age <= 19) {
                System.out.println("Specifically, Teenager");

                if (Age <= 15) {
                    System.out.println("Specifically, Early Teen");
                } else {
                    System.out.println("Specifically, Late Teen");
                }
            } else if (Age <= 59) {
                System.out.println("Adult");
                if (Age <= 35) {
                    System.out.println("Specifically, Young Adult");
                } else {
                    System.out.println("Specifically, Middle Age");
                }
            } else if (Age <= 120) {
                System.out.println("Senior Citizen");
                if (Age <= 75) {
                    System.out.println("Specifically, Young Senior");
                } else {
                    System.out.println("Specifically, Elderly");
                }
            } else {
                System.out.println("Invalid Age.");
            }
        }
    }
}