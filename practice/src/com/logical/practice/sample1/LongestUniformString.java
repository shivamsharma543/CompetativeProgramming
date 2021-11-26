package com.logical.practice.sample1;

/**
 * 
 * e.g. for the input: "abbbccda" the longest uniform substring is "bbb" (which
 * starts at index 1 and is 3 characters long).
 */
public class LongestUniformString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aaaaaaaabbbbccccddddddd";
		System.out.println(findUniformString(str));
		/*
		 * int arr[] = findUniformString(str); System.out.println(arr[0] + "  " +
		 * arr[1]); int a = arr[0]; for (int i = a; i < arr[1] + a; i++) {
		 * System.out.println(str.charAt(i));
		 * 
		 * }
		 */

	}

	/*
	 * public static int[] findUniformString(String str) { int lonestSequence = 0;
	 * int strindex = 1; int longstart = -1;
	 * 
	 * while (strindex < str.length()) { int currentLength = 1; int startPoint =
	 * strindex - 1;
	 * 
	 * while (strindex < str.length() && (str.charAt(strindex) ==
	 * str.charAt(strindex - 1))) {
	 * 
	 * currentLength += 1;
	 * 
	 * strindex++;
	 * 
	 * }
	 * 
	 * if (lonestSequence < currentLength) {
	 * 
	 * lonestSequence = currentLength;
	 * 
	 * longstart = startPoint; }
	 * 
	 * strindex += 1; } System.out.println("longstart  " + longstart
	 * +" lonestSequence " + lonestSequence);
	 * 
	 * return new int[] { longstart, lonestSequence }; }
	 */
	
	public static int[] findUniformString(String str) {

		int maxLength = Integer.MIN_VALUE;
		int startIndex = -1;
		for (int i = 0; i < str.length(); i++) {
			int currentLength = 1;
			int strindex = i;
			while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
				currentLength++;
				i++;
			}
			if (currentLength > maxLength) {
				maxLength = currentLength;
				startIndex = strindex;
			}

		}
		return new int[] { startIndex, maxLength }; }
	 
	
	/*
	 * public static int findUniformString(String str) { int maxLength = 0; int
	 * currLength = 0; for(int i=0;i<str.length();i++) { currLength = 0; while(
	 * i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) { currLength++; i++; }
	 * if(currLength>maxLength) maxLength = currLength; } return maxLength; }
	 */
}