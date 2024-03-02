/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2programming;

import java.util.Scanner;

/**
 *
 * @author sonia_ndonga
 *
 * Module: Object Orientated 
 * Programming: CA2 
 * Date: 1st March 2024 
 * GitHub Repository Link : https://github.com/sonializzie/CA2Programming
 *
 *
 *
 *
 */
public class CA2Programming {
    // Beginning of class method

    public static void main(String[] args) {
        // Beginning of main method

        // Prints out welcome display
        System.out.println("******************************************");
        System.out.println("Welcome to Business Gnómes Ltd.");
        System.out.println("******************************************");

        // Create a Company Object
        Company businessGnómesLtd = new Company("Business Gnómes Ltd");

        // Create a Manager Object
        Manager manager = new Manager();

        // Scanner for user input
        Scanner sc = new Scanner(System.in);

        // Login Menu for Manager
        System.out.println("******************************");
        System.out.println("Manager Login");
        System.out.println("******************************");
        System.out.println("Username: ");
        String usernameInput = sc.nextLine();
        System.out.println("Password: ");
        String passwordInput = sc.nextLine();

        // Validate login credentails 
        if (manager.getUsername().equals(usernameInput) && manager.getPassword().equals(passwordInput)) {
            System.out.println("Manager logged in successfully ");

            // Manager Menu System
            int choice;
            do {
                System.out.println("******************************");
                System.out.println("Manager Menu System");
                System.out.println("******************************");
                System.out.println("1. View Current Staff");
                System.out.println("2. Add New Staff");
                System.out.println("3. Remove Staff");
                System.out.println("4. Logout");

                System.out.println("Enter your choice (1-4): ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        // View Current Staff if when the new staff is created
                        System.out.println("\nCurrent staff:");
                        businessGnómesLtd.listEmployee(0); // Display all employeea
                        businessGnómesLtd.viewStaff(); // View Staff

                        break;

                    case 2:
                        // Creating a New Staff
                        sc.nextLine(); // Consume the newLine character
                        System.out.println("\nEnter Employee Name: ");
                        String newEmployeeName = sc.nextLine();
                        System.out.println("Enter Employee Email: ");
                        String newEmployeeEmail = sc.nextLine();

                        Employee newEmployee = new Employee(newEmployeeName, newEmployeeEmail);
                        businessGnómesLtd.addNewStaff(newEmployee);
                        System.out.println("New employee added successfully.");
                        break;

                    case 3:
                        // Remove Staff
                        // In order to remove staff it will start from 2,3,4 and so on etc.
                        System.out.println("\nEnter Employee Number to Remove: ");
                        int empNumToRemove = sc.nextInt();
                        businessGnómesLtd.removeStaff(empNumToRemove);
                        break;

                    case 4:
                        // Logout when the Manager finishes accessing the login meny system
                        System.out.println("\nManager logged out.");
                        break;

                    // If the number of choice is invalid, then it will print out the number from 1-4
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");

                }

                // Prints if the login details are incorrect
            } while (choice != 4);

        } else {
            System.out.println("Invalid credentials. Manager login failed.");
        }

        // Close the scanner 
        sc.close();

    } // End of main method

} // End of class method
