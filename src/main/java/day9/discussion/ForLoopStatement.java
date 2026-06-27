/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day9.discussion;
import java.util.Scanner;
/**
 *
 * @author ktagl
 */
public class ForLoopStatement {

    public static void main(String[] args) {

        /*
        //syntax
        for (int i = 1; i <= 20; i++){
            System.out.println(i); //code block || statement
        }
         */
 /*
        //syntax
        for (int i = 20; i <= 1; i--){
            System.out.println(i);
        }
         */
        //print your name 10times
        /*
        for (int i = 0; i <= 9; i++ ){
        System.out.println(i + 1 +"Kentfloyd");
         */
 /*
        //calcultes the sum of numbers from 1 to 5:
        int sum = 0;
        for (int i = 0; i <= 5; i++ ){
        //        5
        //sum = sum + 1;
        sum += 1;
        // 1+2 + 3+4 +5 =15
        }
        System.out.println(sum);
         */
        // Mini-Activity: Calcultes the product of numbers from 1 to 5:
        /*
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        long product = 1;
        for (int i = 1; i <= num; i++) {
            product *= i;
        }
        //System.out.println("Product: "+product);
        */
        
        int number = 5;
        
        //print the first five even numbers
        for (int i = 0; i <= 10; i++ ){
        if (i  % 2 == 0){
            System.out.println(i);
        }
        }
    }
}
