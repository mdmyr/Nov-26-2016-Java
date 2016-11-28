package com.recap_Collection.ww;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class String_Methods {
	
	public static void main(String[] args){
		//lets recap the string methods
		
		String _names ="This is a String";
		String _str_holder;
		char _char_holder;
		String _fruits ="  This is apple";
		String _fruit2 ="  THIS is apple";
		
		//at a index
		_char_holder =_names.charAt(1);
		printer(_char_holder);
		//indexof
		printer(_names.indexOf("a"));
		
		
		_names.length();
		System.out.println(_names.substring(4));
		
		//substring
		System.out.println(_names.substring(1, 3));
		
		//contact
		System.out.println(_names.concat(_fruits));
		
		//trim
		System.out.println(_fruits.trim());
		
		System.out.println(_names.compareTo(_fruits));
		System.out.println(_fruits.compareTo(_fruit2));
		System.out.println(_fruits.compareToIgnoreCase(_fruit2));
		
		
		
		//Arraylist
		
		
		List<String> _animals = new ArrayList<String>();
		
		//String[] _animals_Array =null;
		String[] _animals_Array= {"YuvaRaj" , "Swapnica", "RajaChakravarthy","Swaroopa","PeddiRaju"};
		_animals.add("Animal1");
		_animals.add("Amphabians");
		_animals.add(_fruits);
		//_animals.add(_animals_Array);
		
		System.out.println(_animals.toString());
		System.out.println(_animals.iterator());
		
		//iterator
		Iterator Init = _animals.iterator();
		
		while(Init.hasNext()){
			System.out.println(Init.next());
			System.out.println();
		}
	
		LinkedList<String> _l_animals = new LinkedList();
		
		_l_animals.add("donkey");
		_l_animals.add("Monkey");
		_l_animals.add("Konkey");
		
		Iterator<String> _Init = _l_animals.iterator();
		
		int i=1;
		while(_Init.hasNext()){
			i=i-1;
		//	System.out.println(_Init.next().);
		
			_l_animals.set(1, "Ponkey");
			//System.out.println(_l_animals.get(i));
			_l_animals.subList(1, 2);
			_l_animals.addFirst("Great Animals");
			
		}
		
		while(_Init.hasNext()){
			System.out.println(_Init.next());
		}
		
	}

	
	private static void printer(int _indexOf) {
		// TODO Auto-generated method stub
System.out.println("Lets print the content of the String");
		
		System.out.println(_indexOf);
		
	}
	public static void printer(String _str_name){
		System.out.println("Lets print the content of the String");
		
		System.out.println(_str_name);
	}
	public static void printer(char _str_name){
		System.out.println("Lets print the content of the String");
		
		System.out.println(_str_name);
	}
}
