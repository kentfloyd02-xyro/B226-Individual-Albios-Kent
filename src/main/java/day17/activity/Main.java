/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day17.activity;

/**
 *
 * @author ktagl
 */
public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        
        clock.brand = "INPLAY";
        clock.color = "Black";
        clock.weight = 28.5;

        clock.Time();
        clock.Weather();
        clock.Timer();
        clock.Date();
    }
}
