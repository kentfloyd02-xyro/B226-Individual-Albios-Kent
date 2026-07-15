/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day24.activity;

import java.util.Scanner;

/**
 *
 * @author ktagl
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ex.   ----------------------");
        System.out.println("       Account Number: 1001");
        System.out.println("       Account Name: Kent");
        System.out.println("       Balance: 1000");
        System.out.println("      ----------------------");

        System.out.println("");

        System.out.print("Enter Account Number: ");
        String accNo = input.nextLine();
        System.out.print("Enter Account Name: ");
        String name = input.nextLine();
        System.out.print("Enter Balance: ");
        double balance = input.nextDouble();

        while (true) {
            System.out.println("\nChoose Account Type");
            System.out.println("1. Savings");
            System.out.println("2. Checking");
            System.out.print("Choice: ");
            int choice = input.nextInt();

            Account account;

            if (choice == 1) {
                account = new SavingsAccount(accNo, name, balance);
                System.out.println("");
                account.displayAccountInfo();
            } else if (choice == 2) {
                account = new CheckingAccount(accNo, name, balance);
                System.out.println("");
                account.displayAccountInfo();
            } else {
                System.out.println("Invalid choice.");
                continue;
            }

            System.out.println("\nChoose Transaction");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Back");
            System.out.print("Choice: ");
            int transaction = input.nextInt();

            Transaction t = (Transaction) account;

            switch (transaction) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    t.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    t.withdraw(withdrawAmount);
                    break;

                case 3:
                    continue;

                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println("\nUpdated Account Information:");
            account.displayAccountInfo();
            System.exit(0);
            input.close();
        }
    }
}
