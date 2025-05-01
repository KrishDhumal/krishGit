package com.zubair.shop;

public class Product {
	private String name;
	private double price;
	
	public Product() {
	}
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void print() {
		System.out.println("Product: " + name + "\tPrice: " + price);
	}

	public double getPrice() {
		return price;
	}
}
