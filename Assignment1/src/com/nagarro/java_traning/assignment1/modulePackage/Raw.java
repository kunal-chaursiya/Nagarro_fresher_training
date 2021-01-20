package com.nagarro.java_traning.assignment1.modulePackage;

/*
 * Raw: 12.5% of the item cost
 */

public class Raw extends Item{

	public Raw(String name, String type, Double price, int quantity) {
		super(name, type, price, quantity);
	}
	
	public void calc_stl() 
	{
		sale_tax = Constants.TAX_RATE_RAW * price; 
		final_price = price + sale_tax;
	}
}