/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day17.discussion;

//SRP -> SINGLE RESPONSIBILITY PRINCIPLE
// will act as a blueprint of an object that you want to implement
public class Ballpen {
    
    // attributes / fields
    String brand;
    String color;
    float pointSize;
    double weightInGrams;
    
    //purpose / method 
    public void write(){
        System.out.println("Writing...");
    }
    
    public void draw(){
        System.out.println("Drawing....");
    }
    
    public void sketch(){
        System.out.println("Sketching....");
    }
}
