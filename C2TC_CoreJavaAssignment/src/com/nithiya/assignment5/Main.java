package com.nithiya.assignment5;
import java.util.*;
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        int hours = sc.nextInt();
        double costPerHour = sc.nextDouble();

        Airfare obj = null;

        if (choice == 1)
            obj = new AirIndia(hours, costPerHour);
        else if (choice == 2)
            obj = new Kingfisher(hours, costPerHour);
        else if (choice == 3)
            obj = new Indigo(hours, costPerHour);
        else {
            System.out.println("Invalid Choice");
            return;
        }

        obj.display();
    }
}