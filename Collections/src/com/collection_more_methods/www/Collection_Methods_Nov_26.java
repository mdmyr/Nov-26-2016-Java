/**
 * This class explains more about the methods available in the collections
 * Nov-26-2016
 * Methods Covered :
 * 1. Reverse list
 * 2. Convert the Array to list.
 * 3. Collections fill
 */
package com.collection_more_methods.www;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Collection_Methods_Nov_26 {
	public static void main(String[] args) {
		//
		String[] _names = { "Apple", "Banana", "Coconut" };
		// convert the String array to List
		List<String> _l_names = Arrays.asList(_names);
		// printing the list`
		for (String _iterator : _l_names) {
			System.out.println(_iterator);
		}
		System.out.println();
		// Reversing the list using the collection method reverse.
		Collections.reverse(_l_names);
		System.out.println("After Reversing...");
		for (String _iterator : _l_names) {
			System.out.println(_iterator);
		}
		// Fill the list with a value.
		Collections.fill(_l_names, "X");
		System.out.println();
		System.out.println("After update list with fill");
		for (String _Iterator : _l_names) {
			System.out.println(_Iterator);
		}
		// Copy in collection
		List<String> _copy_list = Arrays.asList(_names);
		Collections.copy(_copy_list, _l_names);
		for (String _Iterator : _copy_list) {
			System.out.println(_Iterator);
		}
	}
}
