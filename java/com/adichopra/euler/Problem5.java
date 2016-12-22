package com.adichopra.euler;

public class Problem5 {
    
    public static void main(String[] args) {
	System.out.println(P5(20));
    }
    public static int P5(int n) {
	boolean divisible = true;
	int i = 0;
	while (true) {
	    i++;
	    for (int j = 1; j <= n; j++){
		if (!divisible) break;
		if (i % j != 0) divisible = false;
		else divisible = true;
	    }
	    if (divisible) return i;
	    divisible = true;
	}
    }
}
