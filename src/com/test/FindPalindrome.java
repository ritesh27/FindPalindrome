package com.test;

import java.util.ArrayList;
import java.util.List;

public class FindPalindrome {

	public static void main(String[] args) {
		findAllPalindromes("abbaalla");
	}

	
	public static List<String> findAllPalindromes(String input){
	     int indexStart = 0;
	     int wordMax = input.length();
	     int wordLength;
	     String checkPalindrome;
	     //String allPalindromes = "";
	     List<String> palindromes = new ArrayList<>();
	   //  Predicate<Integer> p = ( Integer v)-> v <= wordMax && indexStart <= v;
	    for (wordLength = 2; wordLength <= wordMax; wordLength++) {
	    	 if(indexStart <= wordLength){
	         checkPalindrome = input.substring(indexStart, wordLength);
	         if ( !"".equals(checkPalindrome) &&  isAllPalindrome(checkPalindrome)){
	            // allPalindromes += " " + checkPalindrome;
	        	 palindromes.add(checkPalindrome);
	         }
	         //once program reads string through once, increment index and scan text again
	         if (wordLength == wordMax && indexStart < wordMax){
	             indexStart++;
	             wordLength = 0;
	         }
	    	 }
	     }
	    // List<String> lettersArray = Collections.list(input.toCharArray());
	     
	     System.out.println("The palindromes in the text are: ");
	     //System.out.println(allPalindromes);
	     palindromes.stream().forEach(s -> System.out.println(s));
	     return palindromes;
	 }


	private static boolean isAllPalindrome(String checkPalindrome) {
		
		StringBuilder sb = new StringBuilder(checkPalindrome);
		
		if(checkPalindrome.equals(sb.reverse().toString())){
			return true;
		}
		return false;
	}
}
