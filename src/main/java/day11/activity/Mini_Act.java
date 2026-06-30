/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day11.activity;

/**
 *
 * @author ktagl
 */
public class Mini_Act {
    public static void main(String[] args) {
        System.out.println("for loop");
        int[] ages = {24, 43, 35, 18, 20, 25};
        
        for (int i = 0; i < ages.length; i++){
            System.out.println(ages[i]);
        }
        
        System.out.println("for each loop");
        
        for (int age:ages){
        System.out.println(age);
        }
    }
}
