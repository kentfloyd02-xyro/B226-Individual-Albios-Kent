/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day15.discussion;

public class RandomNumber {

    public static void main(String[] args) {
        
        // CLI BINGO Simulator
        // Console-Based BINGO Simulator
        // 1 - 75
        
        int roll = (int) (Math.random() * 75) + 1;
        
        String letter;
        
         
        if (roll <= 15) { // 1-15
            letter = "B";
        } else if (roll <= 30) { // 16-30
            letter = "I";
        } else if (roll <= 45) { // 31-45
            letter = "N";
        } else if (roll <= 60) { // 46-60
            letter = "G";
        } else { //61-75
            letter = "O";
        }
        
        System.out.println("Sa letra ng " + letter + " : " + roll);
        
    }
}

/*
    System.out.println("Lotto Numbers: ");
        for (int i = 0; i < 6; i++) {
            int randomNumber = (int) (Math.random() * 58) + 1;

            System.out.println("[" + (i + 1) + "]: " + randomNumber);
        }

        // Lotto Simulator (6 / 58)
*/

// casting 
/*
     // downcasting / upcasting
        int x = 10;
        
        double num = x; // upcasting -> implicit casting
        
        
        float y = 10.5f;
        
        int num2 = (int) y; // downcasting -> explicit casting
        System.out.println(num2);
        // byte short int long float double
 */
 /* // Parsing -> Converts String into primitive data or vice versa.
    String x = "10x";
         
        int num = Integer.valueOf(x);
        System.out.println(num);
 */
