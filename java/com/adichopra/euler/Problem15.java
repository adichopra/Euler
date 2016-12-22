package com.adichopra.euler;

public class Problem15 {
    
    public static void main(String[] args) {
	System.out.println(P15(20));
    }
    public static long P15(int n) {
	long product = 1;
	for (int i = 0; i < n; i++){ 
	    product *= 2 * n - i;
	    product /= (i +1 );
	}
	return product;
    }
}
