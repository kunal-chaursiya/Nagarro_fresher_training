package com.nagarro.java_traning.assignment1.modulePackage;

/*
 * Imported: 10% import duty on item cost + a surcharge (surcharge is: Rs. 5 if the final cost after applying tax & import duty is up to Rs. 100, Rs. 10 if the cost exceeds 100 and up to 200 and 5% of the final cost if it exceeds 200).
 */

public class Imported extends Item{

	public Imported(String name, String type, Double price, int quantity){
		super(name, type, price, quantity);
	}
	public void calc_stl() 
	{
		sale_tax = Constants.IMPORT_DUTY_IMPORTED* price;
		final_price = price + sale_tax;
		if (final_price<=100)
		{
			sale_tax += 5;
			final_price +=5;
		}
		else if (final_price<=200)
		{
			sale_tax += 10;
			final_price +=10;
		}
		else
		{
			final_price += Constants.IMPORT_DUTY_IMPORTED_MORE_THAN_200 * final_price;
			sale_tax = final_price - price;
		}
	}

}