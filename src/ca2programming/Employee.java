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

} // End class for Employee 
