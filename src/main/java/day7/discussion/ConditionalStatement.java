/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day7.discussion;

/**
 *
 * @author ktagl
 */
public class ConditionalStatement {
    
    public static void main(String[] args) {
        /*
        Reqeuirement: Identify if the number is Neutral,Positive or Negative
        int num = 1 ;
        
        String result = (num  > 0) ? "Neutral"
                : (num > 0) ? "Positive"
                :"Negative";
        */

        int num = 1;
        String numberType;
        
        //Simple-if || if-else || if-else-if ladder
        if (num > 1){
         numberType =  "Positive";
        }else if (num < 1){
            numberType = "Negative";
        }else{
            numberType = "Neutral";
        }
        System.out.println(numberType);
        
        
        float temp = 34.5f ;
        String Tempt;
        
        if (temp > 35.0f){
            Tempt = "Fever";
        }else{
            Tempt = "Normal Temp";
        }
        System.out.println(Tempt);
        
        
        
    }
    
}
