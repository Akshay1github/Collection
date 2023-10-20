package com.comp.client.list;

import java.util.List;
import java.util.Vector;

public class Vector2 implements Runnable{

	
	
	
	public static void main(String[] args) {
		
		List list = new Vector();
		
		list.add("Akshay");
		list.add("Ronit");
		list.add("Student");
		list.add("Student");
		
		System.out.println("Elemnets in vector are: "+list);
		
		while(list.contains("Student")) {
			
			list.remove("Student");
			
		}
		
		try {
			System.out.println("Index 1 data: "+list.get(2));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Elements now :"+list);
		System.out.println("Size of vector: "+list.size());
		
		
		
		

	}

	@Override
	public void run() {
		
		
	}

}
