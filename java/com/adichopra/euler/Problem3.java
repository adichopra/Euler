package com.adichopra.euler;

import java.util.ArrayList;

/**
 * This class finds the largest prime factor of the number 600851475143.
 */
public class Problem3 {

  public static void main(String[] args) {
    System.out.println(largestPrimeFactor(600851475143L));
  }

  /*
   * Computes the largest prime factor of N.
   */
  public static int largestPrimeFactor(long n) {
    int largest = 0;
    ArrayList<Integer> factors = factorize(n);
    for (int i : factors) {
      if (factorize(i).size() == 1 && i > largest) {
        largest = i;
      }
    }
    return largest;
  }

  /*
   * Computes the factors of N.
   */
  public static ArrayList<Integer> factorize(long n) {
    ArrayList<Integer> factors = new ArrayList<Integer>();
    for (int i = 1; i <= Math.sqrt(n); i++) {
      if (n % i == 0) factors.add(i);
    }
    return factors;
  }
}
