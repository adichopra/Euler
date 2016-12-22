package com.adichopra.euler;

public class Problem4 {

    public static void main(String[] args) {
	System.out.println(P4(3));
    }	
    public static int P4(int n) {
	int highest = 0;
	for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
	    for (int j = (int) Math.pow(10, n - 1); j < Math.pow(10, n); j++) {
		if(palindrome(i * j) && i * j > highest) highest = i * j;
	    }
	}
	return highest;
    }
    public static boolean palindrome(int n) {
	String s = "" + n;
	String reversed = "";
	for (int i = s.length() - 1; i >= 0; i--) {
	    reversed += s.charAt(i);
	}
	return reversed.equals(s);
    }
}
