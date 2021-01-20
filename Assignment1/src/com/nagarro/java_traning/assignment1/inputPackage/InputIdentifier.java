package com.nagarro.java_traning.assignment1.inputPackage;

import com.nagarro.java_traning.assignment1.modulePackage.Constants;

public class InputIdentifier{
	public static boolean checkItemName (String str) {
		int flag =0;
		try{
			if (str!=null && str.length()!=0)
				 flag = 1;
		}catch (Exception e){flag = 0;
			System.err.print("This field is required. Enter the name again:");	 
		}		
		if (flag == 1)
			return true;
		else
			System.err.print("This field is required. Enter the name again:");
			return false;
}
	public static boolean checkDouble(String str){
		try {
			Double.parseDouble(str);
		}
		catch (NumberFormatException e){
			System.err.print("Enter the Item price again in integer format : ");
			return false;
		}
		return true;
	}

	public static boolean checkItemType(String str){
		if (str.equalsIgnoreCase(Constants.RAW)|str.equalsIgnoreCase(Constants.MANUFACTURED)|str.equalsIgnoreCase(Constants.IMPORTED))
			return true;
		System.err.print("You entered the item type in wrong format. please enter again.\nEnter one of the following (raw,manufactured,imported) :");
		return false;
	}

	public static boolean checkInt(String str){
		try {
			 Integer.parseInt(str);
			 if(Integer.parseInt(str)<0)
				 throw new NumberFormatException ("This field is required and only positive value accepted. Please enter again :");
		}catch (NumberFormatException e){
			System.err.print("This field is required and only positive value accepted. Please enter again :");
			return false;
			}
		return true;
	}
	
}