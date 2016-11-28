
/*
 * To demonstrate the recursive functions in java.
 * 
 * DATE :
 */
package com.collections_tester.www;

import java.sql.Time;

public class Collections_Recursive_001 {
	
	private static final char[] Time = null;


	public static void main(String[] args){
		//recursive methods
		/**
		 * Find the factorial
		 * 
		 */
		System.out.println("Find the factorial.." );
		
		long _out_factorial =4;
		_out_factorial=factorial(_out_factorial);
		
		System.out.println("Factorial is :" + _out_factorial);
		
		
	}
	
	
	//methods of the factorial
	
	public static long factorial(long _out_factorial){
	
		if (_out_factorial== 1 ){
			//System.out.println(Time);
			System.out.println("Exited::");
				return 1 ;
		}
		else
		//System.out.println("Inside else condition::");
		return	_out_factorial = _out_factorial * factorial(_out_factorial-1);
		
			
		
	}

}

/**
 * Find the factorial..
Exited::
Factorial is :24

 */

