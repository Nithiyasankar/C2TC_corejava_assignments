package com.nithiya.assignment5;

public class Indigo implements Airfare {
	int hours;
    double costPerHour;

    Indigo(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    public double calculateAmount() {
        return (hours * costPerHour) * 8;
    }

    public void display() {
        System.out.printf("%.2f\n", calculateAmount());
    }

}
