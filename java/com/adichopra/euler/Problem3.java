package com.adichopra.euler;

import java.util.ArrayList;

public class Problem3 {
    public static void main(String[] args) {
	System.out.println(P3(600851475143L));
    }
    public static int P3(long n) {
	int highest = 0;
	ArrayList<Integer> a = factors(n);
	for (int i: a) {
	    if (factors(i).size() == 1 && i > highest) highest = i;
	}
	return highest;
    }
    public static ArrayList<Integer> factors(long n) {
	ArrayList<Integer> a = new ArrayList<Integer>();
	for (int i = 1; i <= Math.sqrt(n); i++) {
	    if (n % i == 0) a.add(i);
	}
	return a;
    }
}
