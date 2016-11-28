
/**
 * Collection, list 
 * Nov-26
 * 
 */

package com.collections_tester.www;

import java.util.ArrayList;
import java.util.List;

public class Collections_List_001 {

	/*
	 * list ArrayList Advance for loop
	 */

	public static void main(String[] args) {

		String[] _animals = { "Cat", "Dog", "Elephant" };
		List<String> _animal_list = new ArrayList<String>();

		// for loop caller
		_animal_list = adder_String_2_list(_animal_list, _animals);

		printer(_animals);
		printer(_animal_list);
		

	}

	// for loop to add elements from the String to the list as a parameter

	public static List<String> adder_String_2_list(List<String> _in_listname, String[] _in_stringname) {

		// advanced forloop
		for (String _iterator : _in_stringname) {
			_in_listname.add(_iterator);

		}
		return _in_listname;

	}

	public static void printer(String[] _in_str) {
		for (String Iterator : _in_str) {
			System.out.println(Iterator);

		}

	}

	public static void printer(List<String> _in_List) {
		for (String Iterator : _in_List) {
			System.out.println(Iterator.toString());
			System.out.println( "___++"+_in_List.toString());
		}

	}

}
