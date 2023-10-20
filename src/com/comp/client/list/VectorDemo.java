package com.comp.client.list;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		System.out.println("Initial capacity ---> "+v.capacity());
		
		for(int i=0;i<=10;i++) {
			v.add(i, i*2);
			
		}
		System.out.println("Added elements are: "+v);
		v.add(null);
		System.out.println("Added elements are: "+v);
		System.out.println("Current Capacity of vector: "+v.capacity());
	}

}
