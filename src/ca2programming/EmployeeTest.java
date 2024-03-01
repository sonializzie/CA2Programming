/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2programming;

/**
 *
 * @author sonia_ndonga
 */
public class EmployeeTest {
    // Beginning class method of EmployeeTest

    public static void main(String[] args) {
        // Beginning of main method

        //Created 3 Employee Objects which are the following:
        Employee joeBloggs = new Employee("Joe Bloggs", "jb@gmail.com");
        Employee annBanana = new Employee("Ann Banana", "ab@gmail.com");
        Employee tomThumb = new Employee("Tom Thumb", "tt@gmail.com");

        // Declared an Array called projectGroup to store the 3 Employee Objects
        Employee[] projectGroup = {joeBloggs, annBanana, tomThumb};

        //Prints out nextEmpNum value to the terminal window
        System.out.println("Next employee number: " + Employee.getNextEmpNum());

    } // End of main method

} // End class method of EmployeeTest
