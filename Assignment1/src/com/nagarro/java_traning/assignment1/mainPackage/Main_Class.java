package com.nagarro.java_traning.assignment1.mainPackage;
/**
* Write a standalone java program that accepts items details and calculate
* the effective cost  after applying the tax rules.
* 
* Created by  Kunal Chaursiya
* Date 17-01-2021
* java version "1.8.0_271" 
*/

//Main class!

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;

import com.nagarro.java_traning.assignment1.inputPackage.Input;
import com.nagarro.java_traning.assignment1.modulePackage.Item;
import com.nagarro.java_traning.assignment1.outputPackage.Output;

import java.io.IOException;

public class Main_Class{

	public static void main(String[] args) throws IOException{
		ArrayList<Item> list_of_Item = new ArrayList<Item>();
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in)); 
		char user_input;
		Item i;
		do
		{
			i = Input.enterInput();
			i.calc_stl();
			list_of_Item.add(i);
			System.out.print("Do you want to enter details of any other item (y/n):");
			user_input = obj.readLine().charAt(0);
		}while((user_input=='y')||(user_input=='Y'));
		
		for (Item item : list_of_Item){
			Output.output(item);
		}
	}
}