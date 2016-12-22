package com.adichopra.euler;

import java.util.ArrayList;

/**
 * A utility class to compute prime numbers.
 */
public class Primes {

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

  /*
   * Returns if N is prime.
   */
  public static boolean isPrime(long n) {
    return factorize(n).size() == 1;
  }
}
