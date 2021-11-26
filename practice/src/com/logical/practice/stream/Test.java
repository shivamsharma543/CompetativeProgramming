package com.logical.practice.stream;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
	   List<Integer>ls=new ArrayList<Integer>();
	   String [] str=new String[1];
	   String [] []str1=new String[3][2];
	   System.out.println(str.length);
	   System.out.println(str1.length);
	     
	     for(int i=0;i<10;i++) {
	    	 
	    	 if(i==5)
	    		 continue;
	    	 ls.add(i);
	     }
		System.out.println(ls);
	}
	

}
