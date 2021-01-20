package com.nagarro.java_traning.assignment1.outputPackage;

import com.nagarro.java_traning.assignment1.modulePackage.Item;

public class Output {
	public static void output(Item i) {
		System.out.println("Item Name -> "+i.getName());
		System.out.println("Item Price -> "+i.getPrice());
		System.out.println("Sale tax liability per item -> "+i.getSale_tax());
		System.out.println("Final Price per item -> "+i.getFinal_price());
		System.out.println("--------------------------------");
	}	
}