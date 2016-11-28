
/*
 * Collection some more methods
 * 
 * Date : Nov-26-2016
 */

package com.collections_tester.www;

public class Colletion_Methods_2 {

	public static void main (String args[]){
		/**
		 * String methods 
		 * -	Starts with 
		 * -	Ends with 
		 * -	ignore
		 * -	replace
		 * -	upper
		 * -	lower Case
		 */
		
		//simple String Declaration
		
		String _first_name="YuvaRaj" ;
		String _last_name="Singh";
	//	String _fruits ={"Apple","Peach","Bananna","AppleCider"};
		String _full_name;
		
		//SubString
		System.out.println(_first_name.substring(4, 7));
		
		//Contains
		System.out.println(_first_name.contains("v"));
		//tolower
		System.out.println(_first_name.toLowerCase());
		//toupper
		
		System.out.println(_first_name.toUpperCase());
		//tolowercase
		System.out.println(_first_name.toLowerCase());
		
		//trim
		System.out.println(_first_name.concat(_last_name));
		_first_name= _first_name.concat("     _added some space");
		System.out.println(_first_name.toString());
		
		//trim 
		// trim only trims the leading and end spaces.
		System.out.println(_first_name.trim());
		String _beautiful_name="   This is a beautiful space";
		
		System.out.println(_beautiful_name);
		
		//trim works now
		System.out.println(_beautiful_name.trim());
		
		
		//Replace
		
		System.out.println(_beautiful_name.replace("b", "B"));
		System.out.println(_beautiful_name.replace("space", "SPACER!!"));
		

	
		
		
	}
	
	/*
	 * 
	true
yuvaraj
YUVARAJ
yuvaraj
YuvaRajSingh
YuvaRaj     _added some space
YuvaRaj     _added some space
   This is a beautiful space
This is a beautiful space

	 */
}
