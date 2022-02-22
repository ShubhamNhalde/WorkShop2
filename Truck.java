package com.bridgelabz.workshopautoshop;

public class Truck extends Car {
	
	int weight;

	public Truck(int weight, int speed, double regularPrice, String color) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	public double getSalePrice() {
		double salePrice, discount;
		if (weight > 2000) {
			discount = regularPrice * 10 / 100;
		} else {
			discount = regularPrice * 20 / 100;
		}
		salePrice = regularPrice - discount;
		return salePrice;
	}

}
