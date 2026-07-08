/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day6.discussion;

/**
 *
 * @author ktagl
 */
public class LogicalOperator {
    public static void main(String[] args) {
        // Logical &&
        
        
        //Cinema Logic
        
        boolean hasTicket = true;
        boolean hasVaccinationCard = true;
        boolean isSeniorCitizen = true;
        boolean isStudent = true;
        boolean isLoggedIn = true;
        
        // (&&) May ticket -> p'wede kangg pumasok sa sinehan
        System.out.println("Allowed to enter cinema: " + (hasTicket && hasVaccinationCard));
        
        // (||) May ticket (student || senior citizen) -> Discounted
        System.out.println("Eligible for discount: " + (isStudent || isSeniorCitizen));
        
        // NOT(!) Hindi naka loged in sa app
        System.out.println("Cannot reserve seat: " + !isLoggedIn);
       
        
        
        
        /*int num = 100;
        int num2 = 200;
        
        //                   T             F
        boolean result = num < num2 && num > num2;
        System.out.println(result);
        /*
        
        /* &&  RESULT
          T T  T
          T F  F
          F T  F
          F F  F
        */
        
        /* ||  RESULT
          T T  T
          T F  T
          F T  T
          F F  F
        */
    }
}
