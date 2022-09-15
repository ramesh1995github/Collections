package com.company.client.project.module.submodule;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arraylistdemo {

	public static void main(String[] args) {
		ArrayList<Integer>arr=new ArrayList<Integer>();
      arr.add(10);
      arr.add(20);
      arr.add(30);
      arr.add(40);
      System.out.println(arr);
      ListIterator<Integer> itr = arr.listIterator();
      while(itr.hasNext()) {
    	  System.out.println(itr.next());
    	  
      }
     for(Integer i:arr) {
    	 System.out.println(i);
    	 
     }
	}

}
