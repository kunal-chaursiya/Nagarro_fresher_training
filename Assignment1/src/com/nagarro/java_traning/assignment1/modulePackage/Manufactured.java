package com.nagarro.java_traning.assignment1.modulePackage;

/*
 * Manufactured: 12.5% of the item cost + 2% of (item cost + 12.5% of item cost)
 */

public class Manufactured extends Item{

	public Manufactured(String name, String type, Double price, int quantity){
		super(name, type, price, quantity);
	}
	public void calc_stl() 
	{ 
		sale_tax = Constants.TAX_RATE_MANUFACTURED* price + (price + Constants.TAX_RATE_MANUFACTURED* price) * Constants.SURCHRGE_RATE_MANUFACTURED;
		final_price = price + sale_tax;
	}
}