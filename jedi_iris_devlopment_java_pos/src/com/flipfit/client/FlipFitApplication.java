package com.flipfit.client;

import com.flipfit.business.CustomerFlipFitService;
import java.util.Scanner;

public class FlipFitApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomerFlipFitService customerService = new CustomerFlipFitService();

        System.out.println("Welcome to FlipFit Application");
        System.out.println("1. Login");
        System.out.println("2. Registration");
        System.out.println("3. Exit");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Login feature coming soon...");
                break;
            case 2:
                System.out.println("Registration feature coming soon...");
                break;
            case 3:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice");
        }


    }
}