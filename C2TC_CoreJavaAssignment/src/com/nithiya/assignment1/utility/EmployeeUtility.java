package com.nithiya.assignment1.utility;

import com.nithiya.assignment1.employee.Employee;
import com.nithiya.assignment1.employee.Manager;
import com.nithiya.assignment1.employee.Developer;


/**
 * Utility class to perform operations on Employee objects.
 */
public class EmployeeUtility {

    // Public method to display employee details
    public static void displayEmployeeDetails(Employee e) {
        System.out.println("Employee ID: " + e.getEmployeeId());
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
    }

    // Method to increase salary (protected setter used here)
    public static void giveRaise(Employee e, double amount) {
        e.setSalary(e.getSalary() + amount);
    }
}