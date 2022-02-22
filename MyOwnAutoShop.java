package com.bridgelabz.workshopautoshop;

public class MyOwnAutoShop {
	
	public static void main(String[] args) {

		Sedan sedan = new Sedan(245, 500, 400000, "White");
		Ford ford1 = new Ford(2021, 10000, 360, 500000, "Black");
		Ford ford2 = new Ford(2020, 15000, 240, 400000, "Grey");
		Car car = new Car(170, 150000, "Brown");

		System.out.println(sedan.getSalePrice());
		System.out.println(ford1.getSalePrice());
		System.out.println(ford2.getSalePrice());
		System.out.println(car.getSalePrice());
	}

}
