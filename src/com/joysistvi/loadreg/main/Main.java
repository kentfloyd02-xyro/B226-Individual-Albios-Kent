/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joysistvi.loadreg.main;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static double loadBalance = 100.0;

    public static void main(String[] args) {
        validateUssdcode();
    }

    public static void validateUssdcode() {
        System.out.println("Dial *123# to access Smart Services");
        System.out.print("Enter USSD Code: ");
        String ussdCode = scanner.nextLine();

        if (ussdCode.isEmpty() || !ussdCode.equals("*123#")) {
            System.out.println("Invalid USSD Code. Existing....");
            System.exit(0);
        }

        mainMenu();
    }

    public static void mainMenu() {
        System.out.println("--- CHOICE A LOAD THAT YOU WANT ---");
        System.out.println("    [1] Data Promos");
        System.out.println("    [2] Call Promos");
        System.out.println("    [3] Text Promos");
        System.out.println("    [4] Call & Text Promos");
        System.out.println("    [5] Data + Call + Text Combos");
        System.out.println("    [6] Magic Data");
        System.out.println("    [7] Unli Promos");
        System.out.println("    [8] Load Data");
        System.out.println("    [9] Roaming Promos");
        System.out.println("    [10] Unli Call & Text");
        System.out.println("    [11] Check Balance");
        System.out.println("    [12] Exit");

        System.out.print("Enter choice: ");
        int mainMenu = scanner.nextInt();

        switch (mainMenu) {
            case 1:
                dataPromo();
                break;
            case 2:
                callPromo();
                break;
            case 3:
                textPromo();
                break;
            case 4:
                call_textPromo();
                break;
            case 5:
                data_call_textCombo();
                break;
            case 6:
                magicData();
                break;
            case 7:
                unliData();
                break;
            case 8:
                loadData();
                break;
            case 9:
                roamingPromo();
                break;
            case 10:
                roamingPromo();
                break;
           case 11:
               checkBalance();
               break;
              case 12:
               exitProgram();
              break;
            default:
                System.out.println("Invalid Choice!");
        }
    }

    public static void dataPromo() {
        System.out.println("---DATA PROMOS---");
        System.out.println("    [1] 3days for ₱50");
        System.out.println("    [2] 7days for ₱99");
        System.out.println("    [3] 15days for ₱299");
        System.out.println("    [4] 30days for ₱499");
        System.out.println("    [5] Back");
        System.out.print("Enter choice: ");
        int dataPromo = scanner.nextInt();

        switch (dataPromo) {
            case 1:
                subcriptionConfirmation("3-Day Data Promo", 50, 3);
                break;
            case 2:
                subcriptionConfirmation("7-Day Data Promo", 99, 7);
                break;
            case 3:
                subcriptionConfirmation("15-Day Data Promo", 299, 15);
                break;
            case 4:
                subcriptionConfirmation("30-Day Data Promo", 499, 30);
                break;
            case 5:
                mainMenu();
                break;
            default:
                System.out.println("Invalid Choices");
        }
    }

    public static void callPromo() {
        System.out.println("---CALL PROMOS---");
        System.out.println("    [1] 1days for ₱30");
        System.out.println("    [2] 7days for ₱99");
        System.out.println("    [3] 30days for ₱149");
        System.out.println("    [4] Back");
        System.out.print("Enter choice: ");
        int callPromo = scanner.nextInt();

        switch (callPromo) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid Choices");
        }
    }

    public static void textPromo() {
        System.out.println("---TEXT PROMOS---");
        System.out.println("    [1] 1days for ₱20");
        System.out.println("    [2] 7days for ₱50");
        System.out.println("    [3] 30days for ₱99");
        System.out.println("    [4] Back");
        System.out.print("Enter choice: ");
        int textPromo = scanner.nextInt();

        switch (textPromo) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid Choices");
        }
    }

    public static void call_textPromo() {
        System.out.println("---CALL & TEXT PROMOS---");
        System.out.println("    [1] 7days for ₱99");
        System.out.println("    [2] 15days for ₱149");
        System.out.println("    [3] 30days for ₱299");
        System.out.println("    [4] Back");
        System.out.print("Enter choice: ");
        int call_textPromo = scanner.nextInt();

        switch (call_textPromo) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid Choices");
        }
    }

    public static void data_call_textCombo() {
        System.out.println("---CALL & TEXT PROMOS---");
        System.out.println("    [1] 3days for ₱75");
        System.out.println("    [2] 7sdays for ₱149");
        System.out.println("    [3] 30days for ₱299");
        System.out.println("    [4] Back");
        System.out.print("Enter choice: ");
        int data_call_textCombo = scanner.nextInt();

        switch (data_call_textCombo) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid Choices");
        }
    }

    public static void magicData() {
        System.out.println("---CALL & TEXT PROMOS---");
        System.out.println("    [1] 3days for ₱75");
        System.out.println("    [2] 7days for ₱149");
        System.out.println("    [3] 30days for ₱299");
        System.out.println("    [4] Back");
        System.out.print("Enter choice: ");
        int magicData = scanner.nextInt();

        switch (magicData) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid Choices");
        }
    }

    public static void unliData() {
        System.out.println("---CALL & TEXT PROMOS---");
        System.out.println("    [1] 7days for ₱99");
        System.out.println("    [2] 15days for ₱149");
        System.out.println("    [3] 30days for ₱299");
        System.out.println("    [4] Back");
        System.out.print("Enter choice: ");
        int unliData = scanner.nextInt();

        switch (unliData) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid Choices");
        }
    }

    public static void loadData() {
        System.out.println("---CALL & TEXT PROMOS---");
        System.out.println("    [1] 3days for ₱20");
        System.out.println("    [2] 7days for ₱50");
        System.out.println("    [3] 15days for ₱99");
        System.out.println("    [4] 30days for ₱199");
        System.out.println("    [5] Back");
        System.out.print("Enter choice: ");
        int loadData = scanner.nextInt();

        switch (loadData) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid Choices");
        }
    }

    public static void roamingPromo() {
        System.out.println("---CALL & TEXT PROMOS---");
        System.out.println("    [1] 1days for ₱299");
        System.out.println("    [2] 3days for ₱550");
        System.out.println("    [3] 7days for ₱999");
        System.out.println("    [4] Back");
        System.out.print("Enter choice: ");
        int roamingPromo = scanner.nextInt();

        switch (roamingPromo) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid Choices");
        }
    }

    public static void unli_Call_TextPromo() {
        System.out.println("---CALL & TEXT PROMOS---");
        System.out.println("    [1] 3days for ₱99");
        System.out.println("    [2] 7days for ₱149");
        System.out.println("    [3] 30days for ₱299");
        System.out.println("    [4] Back");
        System.out.print("Enter choice: ");
        int unli_Call_TextPromo = scanner.nextInt();

        switch (unli_Call_TextPromo) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid Choices");
        }
    }

    public static void checkBalance() {
        System.out.println("\nCurrent Load Balance: ₱" + loadBalance);
        mainMenu();
    }

    public static void exitProgram() {
        System.out.println("Thank you for using Smart Services.");
        System.exit(0);
    }

    public static void subcriptionConfirmation(String promo, int price, int day) {
        System.out.println("-> Get." + promo + "good for" + day + "Days(s) for only ₱" + price);
        System.out.println("    [1] Subcribe");
        System.out.println("    [2] Back");
        System.out.println("    [3] Exit");
        System.out.print("Enter a choice: ");
        int subcriptionConfirmation = scanner.nextInt();

        switch (subcriptionConfirmation) {
            case 1:
                if (loadBalance >= price) {
                    loadBalance -= price;
                    System.out.println("\nSubscription Successful!");
                    System.out.println("Promo: " + promo);
                    System.out.println("Remaining Balance: ₱" + loadBalance);
                } else {
                    System.out.println("Insufficient Load Balance!");
                }
                mainMenu();
                break;

            case 2:
                mainMenu();
                break;

            case 3:
                exitProgram();
                break;

            default:
                System.out.println("Invalid Choice!");
        }
    }
}
