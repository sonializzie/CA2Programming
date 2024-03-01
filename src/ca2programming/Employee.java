/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2programming;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author sonia_ndonga
 */
public class Employee {
    // Beginning class for Employee

    //Created a class attribute for Employee
    private String name;
    private String email;
    private int empNum;

    //Static field for nexEmpNum
    private static int nextEmpNum = 1;

    //Created a Employee constructor with default values 
    public Employee() {
        this.name = "Default Name";
        this.email = "default@email.com";
        this.empNum = nextEmpNum++;
    }

    // Created a constructor with parameters for Employee 
    //Challenge part section : Checking valid email address
    public Employee(String name, String email) {
        this.name = name;
//        this.email = email.length() > 3 ? email : "default@gmail.com";
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email format. Using a default email.");
            this.email = "default@gmail.com";
        }

        this.empNum = nextEmpNum++;
    }

    // Created a Getters and Setters for Employee
    // Getter method for getName 
    public String getName() {
        return name;
    }

    // Setter method for setName
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for getEmail
    public String getEmail() {
        return email;
    }

    // Setter method for setEmail(email) with validation
    // Value is not accepted if email is not valid
    // Challenge part section : Checking valid email address
    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email. Email not supported");
        }

    }

    // Getter method for getEmpNum
    public int getEmpNum() {
        return empNum;
    }

    // Setter method for setEmpNum
    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    // Getter method for getNextEmpNum to get next employee number
    public static int getNextEmpNum() {
        return nextEmpNum;
    }

    // Settter method for setNextEmpNum with the current value of nextEmpNum
    public static void setNextEmpNum(int nextEmpNum) {
        Employee.nextEmpNum = nextEmpNum;
    }

    // Method for validating email format 
    private boolean isValidEmail(String email) {

        // Expression for a common email format
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        // Compiling the regualar expression 
        Pattern pattern = Pattern.compile(emailRegex);

        // Created a matcher object
        Matcher matcher = pattern.matcher(email);

        // Check to see if the email matches the pattern
        return matcher.matches();
    }

} // End class for Employee 
