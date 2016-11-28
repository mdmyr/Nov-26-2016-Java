package com.collections_tester.www;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class Arraylist_init2 {

	public static void main(String[] args) {
		/*
		 * remove the elements in the arraylist
		 */

		ArrayList<String> names = new ArrayList<String>();
		names.add("YuvaRaj");
		names.add("Mahathi");
		names.add("Raghunapu");
		
		//printer(names);
		//names.remove(3);
		//printer(names);
		
	System.out.println(names.size());
	System.out.println(names.contains("Yuvaraj"));
	System.out.println(names.addAll(names));
	
	System.out.println(names.toArray());
	System.out.println(names.toString());
	//printer(names);
	//System.out.println(names.clone());
	//List< String> duplicates = new ArrayList<String>();
	
	//duplicates = (ArrayList<String>) names.clone();
//System.out.println(duplicates.toString());

	System.out.println(names.isEmpty());
	System.out.println(names.listIterator());
	
	Iterator<String> iterate = null;
	 

	System.out.println(names.toString());
	String _temp_Str = names.toString();
	_temp_Str.contains("pu");
	
	iterate = names.iterator();

	
	C_Printer printer = new C_Printer();
	//printer.printer(names);

	}
/*
	public static void printer(ArrayList<String> print_this){
		System.out.println(print_this.size());
		for(int i=0 ;i<print_this.size();i++){
			
			System.out.println(print_this.get(i));
		}
	}
	*/
	
}
