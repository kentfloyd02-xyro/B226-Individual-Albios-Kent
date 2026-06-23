/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day4.discussion;

/**
 *
 * @author ktagl
 */
public class DataType {

    public static void main(String[] args) {

        boolean isActive = true;
        char letter = 'K';
        byte num = 67;
        short num2 = 690;
        int num3 = 67_68_69;
        long num4 = 61_62_63_64_65_66_67L; //suffix l/L
        float temp = 38.60f; //suffix f/F
        double average = 98.1234565670;
        String word = "Kent";

        System.out.println("Boolean: " + isActive);
        System.out.println("Char:" + letter);
        System.out.println("Byte: " + num);
        System.out.println("Short:" + num2);
        System.out.println("Int: " + num3);
        System.out.println("Long: " + num4);
        System.out.println("Float: " + temp);
        System.out.println("Double: " + average);
        System.out.println("String: " + word);
    }
}
