/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2programming;

/**
 *
 * @author sonia_ndonga
 */
public class Manager extends Employee {
    // Beginning class for Manager

    // Create a class attribute for Manager
    private String username;
    private String password;

    // Created a Manager constructor with default value
    public Manager() {
        super(); // Calling the default of the superclass 
        this.username = "Gnomeo";
        this.password = "smurf";
    }

    // Getters and Setters methods for username and password
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

} // End class for Manager
