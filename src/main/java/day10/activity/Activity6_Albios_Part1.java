/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day10.activity;
import java.util.Scanner;
/**
 *
 * @author ktagl
 */
public class Activity6_Albios_Part1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Multiplication Table of " + num);
        
        for (int i = 1; i <= 10; i++){
          System.out.println( num + " * " + i + " = " + num * i);
        }
        
    }
}
