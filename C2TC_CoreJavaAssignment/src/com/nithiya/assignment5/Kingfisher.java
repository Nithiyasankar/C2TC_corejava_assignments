package com.nithiya.assignment5;

public class Kingfisher implements Airfare {
	int hours;
    double costPerHour;

    Kingfisher(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    public double calculateAmount() {
        return (hours * costPerHour) * 4;
    }

    public void display() {
        System.out.printf("%.2f\n", calculateAmount());
    }
}