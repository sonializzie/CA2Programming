/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2programming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author sonia_ndonga
 */
public class Company {
    // Beginning class for Company

    // Created a class attribute for Company 
    private String companyName;
    private ArrayList<Employee> staff;
    //Bonus Challenge : HashSet to prevent duplicate empNum
    private HashSet<Integer> staffSet;

    // Created a Company default constructor
    public Company() {
        this.companyName = "Default Company";
        this.staff = new ArrayList<>();
        this.staffSet = new HashSet<>(); // Bonus Challenge : HashSet
    }

    // Created a Company constructor that is overloaded
    public Company(String companyName) {
        this.companyName = companyName;
        this.staff = new ArrayList<>();
        this.staffSet = new HashSet<>(); // Bonus Challenge : HashSet
    }

    // Method to add new employee to the staff ArrayList and staffSet 
    public void addNewStaff(Employee employee) {
        if (staffSet.add(employee.getEmpNum())) {
            // empNum was added to HashSet, add employee to the staff ArrayList
            staff.add(employee);
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Employee with empNum " + employee.getEmpNum() + " already exists.");
        }

    }

    // Method to get the number of employees in the staff ArrayList
    public int getStaffNumber() {
        return staff.size();
    }

    // Method to view all staff members
    public void viewStaff() {
        System.out.println("\nAll Staff Members:");
        for (Employee employee : staff) {
            System.out.println("Employee Name: " + employee.getName()
                    + ", Email: " + employee.getEmail()
                    + ", Employee Number: " + employee.getEmpNum());
        }
    }

    // Method to list Employees above a given empNum value 
    public void listEmployee(int empNumValue) {
        Iterator<Employee> iterator = staff.iterator();

        while (iterator.hasNext()) {
            Employee employee = iterator.next();

            if (employee.getEmpNum() > empNumValue) {
                System.out.println("Employee name: " + employee.getName());
            }
        }
    }

    // Challenge Section Code to removeStaff by the manager
    // Method to remove an employee from the staff ArrayList based on the empNum
    public void removeStaff(int empNumToRemove) {
        Iterator<Employee> iterator = staff.iterator();

        while (iterator.hasNext()) {
            Employee employee = iterator.next();

            if (employee.getEmpNum() == empNumToRemove) {
                iterator.remove();
                staffSet.remove(empNumToRemove); // Remove from HashSet
                System.out.println("Employee has been removed successfully.");
                return;
            }
        }
        System.out.println("Employee with empNum " + empNumToRemove + " not found. ");
    }

}// End class for Company
