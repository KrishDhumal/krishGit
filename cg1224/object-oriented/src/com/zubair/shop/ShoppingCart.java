package com.zubair.shop;

import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Product> items;
	private double total;
	
	public ShoppingCart() {
		items = new ArrayList<Product>();
	}

	public void addItem(Product p) throws ShoppingCartException {
		if(5 == items.size())
			throw new ShoppingCartException("Shopping cart is full!!");
		else {
			items.add(p);
			total += p.getPrice();
		}
	}
	
	public void checkout() {
		for(Product p : items) 
			p.print();
		
		System.out.println("Cart Total: " + total);
	}
}

