package com.company.client.project.module.submodule;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Linklistdemo {

	public static void main(String[] args) {
		List<String>list=new LinkedList<String>();
		list.add("vaibhav");
		list.add("amol");
		list.add("ramesh");
	    list.add("juber");
	    System.out.println(list);
	   ListIterator<String> litr = list.listIterator();
	    while(litr.hasNext()) {
	    	System.out.println(litr.next());
	    }
       for(String s:list) {
    	   System.out.println(s);
    	   
       }
}
	}








