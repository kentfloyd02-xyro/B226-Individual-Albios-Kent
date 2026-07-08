/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day6.discussion;

/**
 *
 * @author ktagl
 */
public class TernaryOperator {
    public static void main(String[] args) {
        // syntax
        // (cond) ? true block : false block;
        
        
        // Positive or Negative
        int num = 1 ;
        
        String result = (num  > 0) ? "Neutral"
                : (num > 0) ? "Positive"
                : (num > 100) ? "Number is greater than 100"
                :"Negative";
        //System.out.println(result);
        
        //Fever or Normal Temp
        float temp = 38.5f ;
        
        String tempResult = temp >= 38.5 ? "Fever" : "Normal Temp";
        System.out.println(tempResult);
    }
}
