package com.adichopra.euler;

import java.util.ArrayList;

/**
 * This class finds the sum of all the primes below two million.
 */
public class Problem10 {

  public static void main(String[] args) {
    System.out.println(sumPrimes(2000000));
  }

  /**
   * Computes the sum of all the primes below N.
   */
  public static long sumPrimes(int n) {
    long sum = 0;
    ArrayList<Integer> a = Primes.getPrimesLessThan(n);
    for (int i : a) {
      sum += i;
    }
    return sum;
  }
}
