/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day25.activity;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ktagl
 */
public class Activity16_TodoList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("6:00AM - BREAKFAST");
        tasks.add("10:00AM - PREPARE THINGS TO SCHOOL");
        tasks.add("12:00PM - LUNCH");
        tasks.add("12:15PM - TAKE A BATH AND PREPARE GO TO SCHOOL");
        tasks.add("1:00PM - BSBR TESDA TIME-IN");
        tasks.add("5:00PM - GOING HOME ");
        tasks.add("6:00PM - WATCH THE RECORDED LESSON");
        tasks.add("7:00PM - TAKE A LITTLE NAP");
        tasks.add("8:00PM - BSBR TESDA TIME-OUT");
        tasks.add("9:00PM - DINNER");
        tasks.add("10:00PM - HALF BATH");
        tasks.add("1:00PM - SLEEP");

        while (true) {
            System.out.println("=====CHOOSE IN THIS CHOICES1====");
            System.out.println("    [1] ^Add a task");
            System.out.println("    [2] View all tasks");
            System.out.println("    [3] Update a task");
            System.out.println("    [4] Remove a task");
            System.out.println("    [5] Clear all tasks");
            System.out.println("    [6] Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("FORMAT: TIME - THINGS TO DO");
                    System.out.print("Enter a task:");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    continue;
                case 2:
                    System.out.println("=== TO DO LIST===");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1)+". " + tasks.get(i));
                    }
                    continue;
                case 3:
                    System.out.print("Enter the index: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("FORMAT: TIME - THINGS TO DO");
                    System.out.print("Enter the update task: ");
                    String update = scanner.nextLine();

                    if (index >= 0 && index < tasks.size()) {
                        tasks.set(index, update);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    continue;
                case 4:
                    System.out.print("Enter the index: ");
                    int index2 = scanner.nextInt();
                    if (index2 >= 0) {
                        tasks.remove(index2);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    continue;
                case 5:
                    tasks.clear();
                    continue;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");

            }
        }
    }
}
