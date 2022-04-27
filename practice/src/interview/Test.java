package com.logical.practice.interview;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    char [] arr = {'a','e','f','g','h','a','e','f','h'};     
    String str = "aefghaefg";
    
    List<String> ls = new ArrayList<>();
    
    ls.add("shivam");
    ls.add("sharma");
    ls.add("apple");
    
    List<String> filteredList = ls.stream().filter(str1 -> str1.charAt(0)=='s' || str1.charAt(0)=='S').collect(Collectors.toList());
    
    System.out.println(filteredList);
	}
	
	public static char findFirstNonRepeting(String str) {
		
		return str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream().filter(c -> c.getValue()==1).map(entry -> entry.getKey()).findFirst().get();
		
		
	}

}
