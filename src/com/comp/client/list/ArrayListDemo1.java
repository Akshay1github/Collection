package com.comp.client.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		//Generic and using Iterator(Industry Standards)
		
		List list = new ArrayList();
		
		list.add(19);
		list.add(21);
		list.add(null);
		list.add(38);
		list.add(43);
		list.add(null);
		list.add(20);
		
		 Iterator itr= list.iterator();

		while(itr.hasNext()) {
			
			Object i = itr.next();
			if(i!=null && i.equals(43)) {
				
				itr.remove();
			}
			
		
		}
		for(Object x:list) {
			System.out.println(x);
		}
	}

}
