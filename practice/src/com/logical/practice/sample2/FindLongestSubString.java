package com.logical.practice.sample2;

public class FindLongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aaaabbb";
		System.out.println(findString("abbbccdaaa"));
		
		//System.out.println(str.substring(0,4));

	}
	
	/*
	 * public static String findString(String str) {
	 * 
	 * int length = 1; int start = 0; int max = Integer.MIN_VALUE; String result =
	 * "";
	 * 
	 * for(int i=0;i<str.length()-1;i++) { if(str.charAt(i)==str.charAt(i+1)) {
	 * //aaaabbcc if(length == 1) { start = i; } length++; } else { if(max<length) {
	 * max = length; result = str.substring(start,i+1); } length = 1; }
	 * 
	 * } if(max<length) result = str.substring(start,str.length()); return result;
	 * 
	 * }
	 */
	
	public static String findString(String str) {
	     int count = 1;
	     int maxLength = 0;
	     int start = 0;
	     int maxStart = 0;
	     int i = 1;
	     
	     while(i<str.length()) {
	    	 if(str.charAt(i)==str.charAt(i-1)) {
	    		 count++;
	    	 }
	    	 else {
	    		    if(count>maxLength) {
	    		    	maxLength = count;
	    		    	maxStart = start;
	    		    }
	    		    start = i;
	    		    count = 1;
	    	 }
	    	 i++;
	     }
	     
	     if(count<maxLength) {
	    	 maxStart = start ;
	        maxLength = count;
	     }
	     
	     return str.substring(maxStart,maxStart+maxLength);
	}
	

}
