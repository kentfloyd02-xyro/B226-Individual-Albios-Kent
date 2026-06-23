/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day5.discussion;

/**
 *
 * @author ktagl
 */
public class Activity2_Albios {
    public static void main(String[] args) {
         double income = 50000;  
         double foodAllowance = 15000;
         double transportation = 2500;  
         double rent = 4500;  
         double utilityBill = 3500;
         
         double foodPercent = (foodAllowance/income) * 100;
         double transportationPercent = (transportation/income) * 100;
         double rentPercent = (rent/income) * 100;
         double utilityBillPercent = (utilityBill/income) * 100;
         
        double TotalExpenses = foodAllowance + transportation + rent + utilityBill;
        
        double RemainingBalance = income - TotalExpenses;
         
         System.out.println("MONTH EXPENSES NI KENT");
         System.out.printf("Income: %.0f%n", income);
         System.out.printf("Food Allowance: %.1f%%\n", foodPercent);
         System.out.printf("Transportation: %.1f%%\n", transportationPercent);
         System.out.printf("Rent: %.1f%%\n", rentPercent);
         System.out.printf("Utility Bill: %.1f%%\n", utilityBillPercent);
         System.out.printf("Remaining Balance: %.0f%n", RemainingBalance);
    }
}
