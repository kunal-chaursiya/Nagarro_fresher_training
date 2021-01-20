package com.nagarro.java_traning.assignment1.modulePackage;

//Item class!

public abstract class Item{
	protected String name;
	protected double price;
	protected int quantity;
	protected String type;
	protected double sale_tax;
	protected double final_price;
	
	
	//Parameterized Constructor
	public Item(String name, String type, Double price, int quantity){
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}
    public abstract void calc_stl();
	
    //Getter and Setter methods
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}  
	public double getPrice(){
		return price;
	}
	public void setPrice(float price){
		this.price = price;
	}
	public double getSale_tax(){
		return sale_tax;
	}
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	public void setType(String type){
		this.type = type;
	}
	public double getFinal_price(){
		return final_price;
	}
	public int getQuantity(){
		return quantity;
	}
	public String getType(){
		return type;
	}
}