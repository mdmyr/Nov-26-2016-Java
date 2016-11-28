
/*
 * Collection - String Methods
 */

/**
 * Date : NOVEMBER:26-2016
 * 
 */
package com.collections_tester.www;

public class String_Methods_T1 {
	
	public static void main (String [] args)
	{
		//sample string methods
		
		String _First_name = "Yuvara" ;
		String _last_name ="Raghunapu";
		String _Full_name;
		
		//character at a given index location of a string.using 
		//CharAt();
		System.out.println(_First_name.charAt(1));
		
		//String Concatenation with 
		_Full_name=_First_name.concat(_last_name);
		
		System.out.println(_Full_name);
		
		//find the index in String for a given string.
		System.out.println(_First_name.indexOf("P")); //PRINTING -1 for not found.
		
		System.out.println(_Full_name.indexOf("p"));
		System.out.println(_Full_name.indexOf("a",8));
		
		
		
	}

}

/*
 * OUTPUT
 * 
 u
SYuvaraRaghunapu
-1
13
12
*/
