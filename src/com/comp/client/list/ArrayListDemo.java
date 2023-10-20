package com.comp.client.list;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		arrayList.add("akshay");
		arrayList.add(50);
		arrayList.add('A');
		
		System.out.println("Added elements are: "+arrayList);
		
		boolean contains = arrayList.contains(50);
		System.out.println("Does Arraylist contain given object:"+contains);
		
	    arrayList.remove(2);
	    System.out.println(arrayList);
	   
	    arrayList.add(null);
	    arrayList.add(null);
	    System.out.println("final output:"+arrayList  );
		
		

	}

}
