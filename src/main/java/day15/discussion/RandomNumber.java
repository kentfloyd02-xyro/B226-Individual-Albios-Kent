/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day15.discussion;

/**
 *
 * @author ktagl
 */
public class RandomNumber {

    public static void main(String[] args) {
        System.out.println("Lotto Numbers: ");
        
        // CLI BINGO SIMULATOR
        //Console-Based BINGO Simulator
        // 1- 75
        
        int roll = (int) (Math.random() * 75) + 1;
        
        String letter;
        
        if (roll <= 15){ // 1-15
        letter = "B";
        }else if (roll <= 30){// 16-30
        letter = "I";
        }else if (roll <= 45){// 31-45
        letter = "N";
        }else if (roll <= 60){// 46-60
        letter = "G";
        }else {// 61-75
        letter = "O";
        }
        
        System.out.println("Sa letra ng " + letter + ": " + roll);
        

    }
}

/* Parsing
       int x = 10;
       String num = String.valueOf(x);
       String x ="10";
       int num = Integer.valueOf(x);
       System.out.println(num);
*/
/*
// Lotto Simulator (1 - 58)
        for (int i = 0; i < 6; i++) {
            int randomNumber = (int) (Math.random() * 58) + 1;
            System.out.println("[" + (i + 1) + "]" + randomNumber);
        }
*/
