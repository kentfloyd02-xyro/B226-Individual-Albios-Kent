/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day25.discussion.enumeration;

/**
 *
 * @author ktagl
 */
public enum Day {
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

class Printer{
    public static void main(String[] args) {
        for(Day day : Day.values()){
            System.out.println(day);
        }
    }
}
