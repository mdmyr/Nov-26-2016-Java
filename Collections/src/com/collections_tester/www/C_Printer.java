package com.collections_tester.www;

import java.util.ArrayList;

public class C_Printer {

	public void printer(ArrayList<String> ArryList){
		
		int i =0;
		for(;i<ArryList.size();i++){
			System.out.println("The Value in the array list @ " + i +" : : "+ ArryList.get(i));
		}
		
	}
	
}
