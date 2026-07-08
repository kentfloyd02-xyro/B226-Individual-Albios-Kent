/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day13.activity;
import java.util.Scanner;
/**
 *
 * @author ktagl
 */
public class Activity9_Albios {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        contains() 
//      The contains() method checks if a string contains a specific sequence of characters.
        
        String message = "Hello World";
        System.out.println(message.contains("Hello"));//string.contains("text");
       
//        endsWith() 
//      The endsWith() method checks if a string ends with a specified suffix.

        String file = "report.pdf";
        System.out.println(file.endsWith(".pdf")); //string.endsWith("suffix");
        
//        startsWith()
//      The startsWith() method checks if a string begins with a specified prefix.

        String name = "Java Programming"; 
        System.out.println(name.startsWith("Java")); //string.startsWith("prefix");

//        indexOf()
//      The indexOf() method returns the position of the first occurrence of a character or substring.

        String word = "Programming"; 
        System.out.println(word.indexOf("g")); //string.indexOf("text");
        
//        isEmpty()
//      The isEmpty() method checks if a string has no characters.

        String text = ""; 
        System.out.println(text.isEmpty()); //string.isEmpty();
        
//        trim()
//      The trim() method removes spaces at the beginning and end of a string.

        String text2 = " Hello Java "; 
        System.out.println(text2.trim()); //string.trim();
        
//        replace()
//      The replace() method replaces characters or words in a string with new ones.
        
        String sentence = "I like cats"; 
        System.out.println(sentence.replace("cats", "dogs")); //string.replace("old", "new");
        
//        toCharArray()
//      The toCharArray() method converts a string into an array of characters.

        String text3 = "Java"; 
        char[] letters = text3.toCharArray(); //string.toCharArray();
        for(char c : letters){ 
            System.out.println(c);
        }
//        nextLine().charAt()
//      nextLine().charAt() is used to get a specific character from user input.

        System.out.print("Enter a letter: "); 
        char letter = input.nextLine().charAt(0); //scanner.nextLine().charAt(index);
        System.out.println("You entered: " + letter);
        
//        valueOf()
//      The valueOf() method converts different data types into a string.

        int number = 100; 
        String result = String.valueOf(number); //String.valueOf(value);
        System.out.println(result);
        
     /*
        Method                              Purpose
        contains()              Checks if text exists in a string
        endsWith()              Checks if a string ends with specific text
        startsWith()            Checks if a string starts with specific text
        indexOf()               Finds the position of a character or text
        isEmpty()               Checks if a string is empty
        trim()                  Removes spaces before and after text
        replace()               Replaces characters or words
        toCharArray()           Converts string into character array
        nextLine().charAt()	Gets a character from user input
        valueOf()               Converts values into strings
     */   
     
     // Stretch Goal
        System.out.print("Enter a country: ");
        String country = input.nextLine();

        char firstLC = country.charAt(0);
        char lastLC = country.charAt(country.length() - 1);

        System.out.println(firstLC);
        System.out.println(lastLC);

        int counter = 0;
        for (int i = 0; i < country.length(); i++) {
            char letterCount = country.charAt(i);

            if (letterCount == 'P' || letterCount == 'p') {
                counter++;
            }
        }

        System.out.println("Total of P/p is: " + counter);

        int vowelCount = 0;
        for (int j = 0; j < country.length(); j++) {
            char vowelCounter = Character.toLowerCase(country.charAt(j));

            if (vowelCounter == 'a' || 
                vowelCounter == 'e' || 
                vowelCounter == 'i' || 
                vowelCounter == 'o' || 
                vowelCounter == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Total vowels is: " + vowelCount);


    }
}
