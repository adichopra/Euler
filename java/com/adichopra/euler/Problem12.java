package com.adichopra.euler;

public class Problem12 {

    public static void main(String[] args) {
	System.out.println(P12(500));
    }
    public static int P12(int n) {
	int i = 1;
	int counter = 1;
	while (Problem3.factors(i).size() * 2 < n) { //Reuses the factors method from problem 3
	    counter++;
	    i = counter * (1 + counter) / 2;
	}
	return i;
    }
}
