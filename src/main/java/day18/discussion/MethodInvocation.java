/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day18.discussion;


public class MethodInvocation {
    
    
    public static void main(String[] args) {
        MethodInvocation obj = new MethodInvocation();
        obj.b();
        a();
    }
    
    
    // static method
    public static void a(){
        System.out.println("Accessing static method...");
    }
    
    // instance method
    public void b() {
        System.out.println("Accessing instance method...");
    }
    
    
    
}
