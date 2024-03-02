/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2programming;

import java.util.ArrayList;
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

    // Created a Company default constructor
    public Company() {
        this.companyName = "Default Company";
        this.staff = new ArrayList<>();
    }

    // Created a Company constructor that is overloaded
    public Company(String companyName) {
        this.companyName = companyName;
        this.staff = new ArrayList<>();
    }

    // Method to add new employee to the staff ArrayList
    public void addNewStaff(Employee employee) {
        staff.add(employee);
    }

    // Method to get the number of employees in the staff ArrayList
    public int getStaffNumber() {
        return staff.size();
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
    
    
    // Method to remove an employee from the staff ArrayList based on the empNum
    public void removeStaff(int empNumToRemove){
        Iterator<Employee> iterator = staff.iterator();
        
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            
            if (employee.getEmpNum() == empNumToRemove){
                iterator.remove();
                System.out.println("Employee has been removed successfully.");
                return;
            }
        }
        System.out.println("Employee with empNum " + empNumToRemove + " not found. ");
    }

}// End class for Company
