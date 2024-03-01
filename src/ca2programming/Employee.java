/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2programming;

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
    //Part 1 (a) for Employee constructor before Challenge ***
    public Employee(String name, String email) {
        this.name = name;
        this.email = email.length() > 3 ? email : "default@gmail.com";
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
    // Value is not accepted if the length is 3 or less.
    public void setEmail(String email) {
        if (email.length() > 3) {
            this.email = email;
        } else {
            System.out.println("Invalid email. It must be longer thans 3 characters");
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

} // End class for Employee 
