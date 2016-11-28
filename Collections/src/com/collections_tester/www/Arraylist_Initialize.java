package com.collections_tester.www;

import java.util.ArrayList;

public class Arraylist_Initialize {

	public static void main(String[] args) {
		// initializing the arraylist

		ArrayList<String> fruits = new ArrayList<String>();

		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Peach");

		// print the list using the for loop

		 
		  printer (fruits);

		// adding at a specific location

		fruits.add(1, "Apricots");

		System.out.println(fruits.get(1));

		fruits.remove(1);
		fruits.get(1);
		
		
		//creating instance for the printing .. 
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println("Printing the values from the index @ location : " + i + ":::" + fruits.get(i));
			
		}
	
		 
		  printer (fruits);
			

	}

	private static void printer(ArrayList<String> Str) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < Str.size(); i++) {
			System.out.println("Printing the values from the index @ location : " + i + ":::" + Str.get(i));
			
		}
		
	}
	
	
	

}
