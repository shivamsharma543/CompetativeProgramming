package com.logical.practice.sample2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SetOfAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(listofAnagram(Arrays.asList(new String[] {"cat","tac","dog","ogd","shiv"})));

	}

	public static List<String> listofAnagram(List<String> ls) {
		
		Map<String,List<String>> map = new HashMap<>();
		List<String> result = new ArrayList<>();
		 ls.stream().forEach(str -> {
			                          char [] array = str.toCharArray();
			                          Arrays.sort(array);
			                          String sortedString = String.valueOf(array);
			                          if(map.containsKey(String.valueOf(sortedString))) {
			                        		  List<String> tempList = map.get(sortedString);
			                        		  tempList.add(str);
			                        		  map.put(sortedString, tempList);
			                          }
			                          else {
			                        	  List<String> tempList = new ArrayList<>();
			                        	  tempList.add(str);
			                        	  map.put(sortedString,tempList );
			                          }
			                        	 
		 });
		 
		 map.entrySet().stream().filter(entry -> entry.getValue().size()>1).forEach(entry -> {
			                                                                                  result.addAll(entry.getValue());
		                                                                                     });
		 return result;
	}
}
