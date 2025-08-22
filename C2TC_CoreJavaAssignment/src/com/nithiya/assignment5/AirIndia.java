package com.nithiya.assignment5;

public class AirIndia implements Airfare {
	    int hours;
	    double costPerHour;

	    AirIndia(int hours, double costPerHour) {
	        this.hours = hours;
	        this.costPerHour = costPerHour;
	    }

	    public double calculateAmount() {
	        return hours * costPerHour;
	    }

	    public void display() {
	        System.out.printf("%.2f\n", calculateAmount());
	    }
}
