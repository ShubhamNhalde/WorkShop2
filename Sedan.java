package com.bridgelabz.workshopautoshop;

public class Sedan extends Car {
	
	int length;

	public Sedan(int length, int speed, double regularPrice, String color) {
		super(speed, regularPrice, color);
		this.length = length;
	}

	public double getSalePrice() {
		double salePrice, discount;
		if (length > 20) {
			discount = regularPrice * 5 / 100;
		} else {
			discount = regularPrice * 10 / 100;
		}
		salePrice = regularPrice - discount;
		return salePrice;
	}

}
