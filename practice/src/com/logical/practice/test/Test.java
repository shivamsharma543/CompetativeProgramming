package com.logical.practice.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * for(int i = 0; i<10;i++) { System.out.println(i); if(i==5) { throw new
		 * RuntimeException(); } }
		 */
         String letters = "stry";
         String word = "stry";
         
         boolean flag = word.toLowerCase().chars().mapToObj(ch -> (char) ch).anyMatch(ch -> letters.indexOf(ch)<0);         
         System.out.println(flag);
	}
	
	public List<String> getMaxLengthList(String [] words,String letter){
		List<String> ls = new ArrayList<String>();
		Map<String,Integer> map = new HashMap<>();
		int max = 0;
		for(String word:words) {
			if(!findWordInDict(word,letter)) {
				map.put(word,word.length());
				if(max<word.length())
					max= word.length();
				 //ls.add(word);                   // 
			}
				
		}
		
		final int max1 = max;
		
		return map.entrySet().stream().filter(entry -> entry.getValue()==max1).collect(Collectors.toList());
		
		String result = ls.stream().max((str1,str2)->str1.length()>str2.length()?1:-1).get();
		
		List<String> resultOfList = ls.stream().filter(str -> str.length()==result.length()).collect(Collectors.toList());
		
		return resultOfList;
		
		
	}
	
	public static boolean findWordInDict(String word,String letters) {
		
		return word.toLowerCase().chars().mapToObj(ch -> (char) ch).anyMatch(ch -> letters.indexOf(ch)<0);
	}

}