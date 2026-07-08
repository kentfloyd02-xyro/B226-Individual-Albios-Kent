/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day17.discussion;


// SRP -> Single Responsibity Principle
// Will act as a blueprint of an object that you want to implement
public class Ballpen {
    
    // attributes / fields
    String brand;
    String color;
    float pointSize;
    double weightInGrams;
    
// purpose / method
public void write() {
    System.out.println("Writing....");
}

public void draw() {
    System.out.println("Drawing......");
}

public void sketch() {
    System.out.println("Sketching...");
    }
    
    
    
}
