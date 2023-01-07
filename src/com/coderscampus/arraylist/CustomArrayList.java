package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	
	int i = 10; // initial max capacity of items array
	
	Object[] items = new Object[i];

	@Override
	public boolean add(T item) {
		
		return false;
	}

	@Override
	public int getSize() {
		
		int sizeOfList = 0;
		
		while (items != null) {
			sizeOfList = sizeOfList + 1;
		}
		if (sizeOfList == 0) {
			System.out.println("The list is empty");
		}
		return sizeOfList;
	}

	@Override
	public T get(int index) {
		
		if (index <= getSize())  {
			return (T) items[index];
		} else if (index > getSize()) {
			System.out.println("Index is out of bounds");
		}
		return null;
	}
	
}
