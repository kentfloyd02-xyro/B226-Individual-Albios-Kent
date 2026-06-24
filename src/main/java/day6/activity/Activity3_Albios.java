/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day6.activity;

/**
 *
 * @author ktagl
 */
public class Activity3_Albios {
    public static void main(String[] args) {
        
         //prog 1
         int age = 20;
         boolean hasValidId = true;
         System.out.println((age >= 18 && hasValidId) ? "Access Granted" : "");
         //prog 1 end
         
         //prog 2
         boolean isWeekend = true;
         boolean isHoliday = false;
         System.out.println((isWeekend || isHoliday) ? "No Class Today" : "");
         //prog 2 end
         
         //prog 3
         int score = 85;
         String GradeScore = score >= 75 ? "Passed" : "Failed";
         System.out.println(GradeScore);
         //prog 3 end
         
         //prog 4
         int num1 = 10;
         int num2 = 25;
         int LargerNum = num1 > num2 ? num1 : num2;
         System.out.println("The Larger number is: " + LargerNum);
         //prog 4 end

         //Strecth Goal Sa Buhay
         int num3 = 67;
         String Siga = (num3 %2 == 0) ? "Even" : "Odd";
         System.out.println(Siga);
    }
}
