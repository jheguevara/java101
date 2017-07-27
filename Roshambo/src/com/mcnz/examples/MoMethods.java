package com.mcnz.examples;

public class MoMethods {


	public static void main(String[] args) {
		MoMethods.longestYarn("Dee", "J");
		String result = MoMethods.longestTwine("Fred", "Flintstone");
		System.out.println(result);
		int x = 2;
		String word = "decimate";
		System.out.println( MoMethods.isItLongerThan(word, x) );
		
		System.out.println( MoMethods.tooLazyToImplement("x", "y", "z", 'c') );
		
		NumberChar myNumberChar = MoMethods.stringAndChar("", ' ');
		System.out.println(myNumberChar.c);
		System.out.println(myNumberChar.number);


	}
	
	public static NumberChar stringAndChar(String s, char c) {
		NumberChar nc = new NumberChar();
		nc.c = 'x';
		nc.number = 10;
		return nc;
	}
	
	public static int tooLazyToImplement(String x, String y, String z, char c) {
		double number = ((10 * Math.random()) % 3) +1;
		System.out.println(number);
		return (int)number;
	}
	
	
	public static boolean isItLongerThan(String s, int givenSize) {
		
		boolean flag = s.length() > givenSize;
		return flag;
		
	}
	
	public static void longestYarn (String one, String two) {
		String longest = two;
		if ( one.length() > two.length() ){
			longest = one;
		}
		System.out.println(longest);
	}
	
	public static String longestTwine(String a, String b) {
		String longest = b;
		if ( a.length() > b.length() ){
			longest = b;
		}
		//System.out.println(longest);
		return longest;
	}

}