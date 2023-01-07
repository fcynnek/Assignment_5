package com.fcynnek.assignment5;

import com.coderscampus.arraylist.*;

public class CustomListApplication {

	public static void main(String[] args) {
		
		// TESTING THE CODE:
		CustomList<String> myCustomList = new CustomArrayList<>();
		
		myCustomList.add("element 1"); // then add 10, 20, or 40 elements
		
		// then validate that all the elements exist in the data structure
		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}
	}

}
