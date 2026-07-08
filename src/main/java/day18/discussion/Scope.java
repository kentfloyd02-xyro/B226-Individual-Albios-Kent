/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day18.discussion;


public class Scope {
    
    int num = 10; // instance variable
    static int num2 = 20; // static variable
    
    public static void main(String[] args) {
        String name = "Winter"; // local variable
        System.out.println(name);
        Scope scope = new Scope();
        System.out.println(scope.num);
        System.out.println(num2);
    }
    
    public void sum() {
        Scope scope = new Scope();
        System.out.println(scope.num);
        System.out.println(num2);
    }
    
    public void product() {
        System.out.println(num2);
    }
    
    
    public void greet() {
        // if loop switch
        // block level scope
        if (true) {
            int sum = 0;
        }
        
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
        
        
    }
     
}
