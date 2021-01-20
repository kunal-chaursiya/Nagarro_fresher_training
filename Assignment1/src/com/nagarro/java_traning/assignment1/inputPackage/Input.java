package com.nagarro.java_traning.assignment1.inputPackage;

//input class

import java.io.InputStreamReader;

import com.nagarro.java_traning.assignment1.modulePackage.*;

import java.io.IOException;
import java.io.BufferedReader;

public class Input {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static Item enterInput() throws IOException
	{
		String name;
		String str;
		String type ;
		Double price;
		int quantity;
		boolean valid;
		
		System.out.print("Enter the Item name : ");
		do {
			str = br.readLine();
			valid = InputIdentifier.checkItemName(str);
		}while(!valid);
		name = str;

		System.out.print("Enter the Item price : ");
		do{
			str = br.readLine();
			valid  = InputIdentifier.checkDouble(str);
		}while(!valid);
		price =  Double.parseDouble(str);
		
		System.out.print("Enter the Item quantity : ");
		do{
			str = br.readLine();
			valid  = InputIdentifier.checkInt(str);
		}while(!valid);
		quantity = Integer.parseInt(str);
		
		System.out.print("Enter the Item type from one of the following (raw,manufactured,imported) : ");
		do{
			str = br.readLine();
			valid  = InputIdentifier.checkItemType(str);
		}while(!valid);
		type = str.toLowerCase();


		
		Item i;
		switch(type)
		{
			case Constants.RAW:
				i = new Raw(name,type,price,quantity);
				break;
			case Constants.MANUFACTURED:
				i = new Manufactured(name,type,price,quantity);
				break;
			default :
				i = new Imported(name,type,price,quantity);
				break;
				
		}
		return i;

	}

}