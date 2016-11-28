
/*
 * Converting arraylist to List
 * Nov-27 2016
 * 
 * two types of converting the arrays to list as below.
 */
 package com.recap_Collection.ww;



import java.util.*;

public class Array_2_List {

	public static void main(String[] args){
		System.out.println("Starting the process :");
		String[] _s_names= {"dad","mom"};
		ArrayList<String> _al_name = new ArrayList<String>();
		
		//type 1 of converting the arrays to list
		LinkedList<String> _s_names_extnd = new  LinkedList<String>(Arrays.asList(_s_names)) ; 
		
		
		// type 2 of converting the arrays to list
		
		List<String> _list = Arrays.asList(_s_names);
		
		
		
		for(String _iterate : _s_names_extnd){
			System.out.println(_iterate.toUpperCase());
		}
		
	
		_s_names_extnd.addFirst("Am first");
		
		for (String _iterate : _s_names_extnd){
			System.out.println();
			System.out.println(_iterate);
		}
		
		//Converting back to array
		
		_s_names =_s_names_extnd.toArray(new String[_s_names_extnd.size() ] );
		
		for(String _iterate : _s_names){
			System.out.println(_iterate);
		}
		
	}	
	
	
	
	
}
