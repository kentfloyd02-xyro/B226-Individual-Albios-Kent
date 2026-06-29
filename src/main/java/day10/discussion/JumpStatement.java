package day10.discussion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ktagl
 */
public class JumpStatement {
      public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            
            if (i == 3 || i == 5 || i == 7) {
                continue; 
            }
            
            System.out.println(i);
            
        }
    } // skip: 3 , 5 , 7
}
