package com.nithiya.assignment1;

import com.nithiya.assignment1.employee.Manager;
import com.nithiya.assignment1.employee.Developer;
import com.nithiya.assignment1.utility.EmployeeUtility;

/**
 * Main class to demonstrate the functionality of Employee, Manager, and Developer.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        Manager m1 = new Manager("Nithiya", 101, 75000, "HR");
        Developer d1 = new Developer("Abinaya", 102, 65000, "Java");

        System.out.println("Manager Details:");
        EmployeeUtility.displayEmployeeDetails(m1);
        System.out.println("Department: " + m1.getDepartment());

        System.out.println("\nDeveloper Details:");
        EmployeeUtility.displayEmployeeDetails(d1);
        System.out.println("Programming Language: " + d1.getProgrammingLanguage());

        // Give raise
        System.out.println("\nGiving raise...");
        EmployeeUtility.giveRaise(m1, 5000);
        EmployeeUtility.giveRaise(d1, 4000);

        System.out.println("\nAfter Raise:");
        EmployeeUtility.displayEmployeeDetails(m1);
        EmployeeUtility.displayEmployeeDetails(d1);
    }
}