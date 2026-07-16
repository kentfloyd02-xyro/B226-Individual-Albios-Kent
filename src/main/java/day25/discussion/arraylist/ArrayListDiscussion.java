/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day25.discussion.arraylist;

import java.util.ArrayList;

/**
 *
 * @author ktagl
 */
public class ArrayListDiscussion {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        
        cars.add("Isuzu");
        cars.add("Ferrari");
        cars.add("Ford");
        cars.add("Bugatti");
        cars.add("Toyota");
        cars.add(1, "Lightning McQueen");
        
//        System.out.println(cars);
//        
//        System.out.println(cars.get(0));
//        System.out.println(cars.get(cars.size()-1));
        
        cars.set(1, "McQueen");
        
//        System.out.println(cars.get(1));
        
//        cars.remove(1);
//        cars.remove("Toyota");
        
//        System.out.println(cars.get(1));
        
//        cars.removeAll(cars);
        cars.clear();
        
        System.out.println(cars);
    }
}


/*
CRUD OPERATION

CREATE -> add()
READ -> get()
UPDATE -> set()
DELETE ->remove()

DELETE ALL -> removeAll() || clear()
*/