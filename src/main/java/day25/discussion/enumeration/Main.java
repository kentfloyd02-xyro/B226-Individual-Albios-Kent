/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day25.discussion.enumeration;

/**
 *
 * @author ktagl
 */
public class Main {

//    enum Day {
//        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
//    }

    public static void main(String[] args) {
        
        Day today = Day.WEDNESDAY;
        
        if(today == Day.MONDAY || today ==Day.TUESDAY){
            System.out.println("Start of the week");
        }else if(today == Day.WEDNESDAY || today ==Day.THURSDAY){
            System.out.println("It's midweek");
        }else if (today == Day.FRIDAY) {
            System.out.println("Weekend is near");
        }else{
            System.out.println("Weekend!");
        }
        
        System.out.println(today);
//        System.out.println(Day.MONDAY);
    }
}
