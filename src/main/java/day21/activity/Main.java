/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day21.activity;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = input.nextLine();

        System.out.print("Middle Name: ");
        String middleName = input.nextLine();

        System.out.print("Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Address: ");
        String address = input.nextLine();

        System.out.print("Email: ");
        String email = input.nextLine();

        System.out.print("Password: ");
        String password = input.nextLine();

        UserAccount user = new UserAccount(firstName, middleName, lastName, address, email, password);

        System.out.println("\n--- User Info ---");
        System.out.println("Full Name: " + user.getFirstName() + " " + user.getMiddleName() + " " + user.getLastName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Address: " + user.getAddress());

        input.close();
    }
}
