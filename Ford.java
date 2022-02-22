package com.bridgelabz.workshopautoshop;

public class Ford extends Car {
	
	int year;
	int manufacturerDiscount;

	public Ford(int year, int manufacturerDiscount, int speed, double regularPrice, String color) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	public double getSalePrice() {
		double salePrice;
		double price = super.getSalePrice();
		salePrice = price - manufacturerDiscount;
		return salePrice;
	}
	
	

}
