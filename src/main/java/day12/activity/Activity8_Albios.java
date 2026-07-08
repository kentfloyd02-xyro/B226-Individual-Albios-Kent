/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day12.activity;

import java.util.Scanner;

/**
 *
 * @author ktagl
 */
public class Activity8_Albios {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" === Grades Average Calcu ===");

        System.out.print("Enter number of student: ");
        int students = input.nextInt();

        System.out.print("Enter number of subject: ");
        int subjects = input.nextInt();
        input.nextLine();

        String[] subjectNames = new String[subjects];
        System.out.println("");

        for (int i = 0; i < subjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectNames[i] = input.nextLine();
        }

        String[] studentNames = new String[students];
        System.out.println("");

        double[][] grades = new double[students][subjects];
        double[] average = new double[students];

        for (int j = 0; j < students; j++) {
            System.out.print("Student " + (j + 1) + ": ");
            studentNames[j] = input.nextLine();

            double sum = 0;
            System.out.println("Enter grades");

            for (int k = 0; k < subjects; k++) {
                System.out.print(subjectNames[k] + ": ");
                grades[j][k] = input.nextDouble();
                sum += grades[j][k];
            }

            average[j] = sum / subjects;
            input.nextLine();
        }

        System.out.println("\n=================================");
        System.out.println("         Grades Report");
        System.out.println("=================================");

        System.out.printf("%-15s", "Student");

        for (int s = 0; s < subjects; s++) {
            System.out.printf("%-10s", subjectNames[s]);
        }

        System.out.printf("%-10s\n", "Average");

        for (int st = 0; st < students; st++) {
            System.out.printf("%-15s", studentNames[st]);

            for (int sub = 0; sub < subjects; sub++) {
                System.out.printf("%-10.0f", grades[st][sub]);
            }

            System.out.printf("%.2f\n", average[st]);
        }

    }
}
