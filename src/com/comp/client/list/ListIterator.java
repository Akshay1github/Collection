package com.comp.client.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		
		list.add("Akshay");
		list.add("Ronie");
		list.add("Toshi");
		list.add("Anna");
		list.add("meow");
		list.add("haha");
		
		java.util.ListIterator<String> itr = list.listIterator();
		
		while(itr.hasNext()) {
			
			String str = itr.next();
			
			if(str.equals("haha")) {
				
				//itr.remove();
				itr.set("Newly added String");
				
			}
			
			List<Object> emptyList = Collections.emptyList();
			System.out.println(emptyList);
			
		} for(String o:list) {
			System.out.println(o);
		}
		

	}

}
