package com.adichopra.euler;

public class Problem7 {

    public static void main(String[] args) {
	System.out.println(P7(10001));
    }
    public static int P7(int n) {
	int i = 0;
	int j = 0;
	while (i <= n) {
	    j++;
	    if (Problem3.factors(j).size() == 1) i++; //Reuses the factors method from problem 3
	}
	return j;
    }
}
