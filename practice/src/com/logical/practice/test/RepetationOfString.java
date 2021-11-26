package com.logical.practice.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class RepetationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/////   111222  ====>   output 12
////    111     ====>   output 1
////    11122211  ===>  output 12
///     111222111 ===>  output 121		
		
		  List<Integer> ls = new ArrayList<>();
		  
		  ls.add(1); ls.add(1); ls.add(1); ls.add(2); ls.add(2);
		  
		  System.out.println(push(ls));
		 
		
		
	}
	
	
	public static List<Integer> push(List<Integer> ls) {
		List<Integer> result = new ArrayList<>();
		result.add(ls.get(0));
		for (int i = 1; i < ls.size(); i++) {
			if(result.isEmpty()) {
				result.add(ls.get(i));
			}
			else if (result.get(result.size() - 1) == ls.get(i)) {
				result.remove(result.size() - 1);
			} else {
				result.add(ls.get(i));
			}
		}
		return result;
	}
	   
}
