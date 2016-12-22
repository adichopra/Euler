package com.adichopra.euler;

import java.util.ArrayList;

public class Problem10 {

    public static void main(String[] args) {
	System.out.println(P10(2000000));
    }
    //Problem 10 [TOO LONG] (1m2.304s)
    public static long P10(int n) {
	long sum = 0;
	ArrayList<Integer> a = primes(n);
	for (int i: a) {
	    sum += i;
	}
	return sum;
    }
    public static ArrayList<Integer> primes(int n) {
	ArrayList<Integer> a = new ArrayList<Integer>();
	for (int i = 2; i <= n; i++) {
	    if (a.size() != 0) {
		boolean prime = true;
		for (int j: a) {
		    if (i % j == 0) {
			prime = false;
			break;
		    }
		}
		if (prime){
		    //System.out.println(i);
		    a.add(i);
		}
	    }
	    else a.add(i);
	}
	return a;
    }
}
