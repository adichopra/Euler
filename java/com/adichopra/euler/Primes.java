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

  /**
   * Computes the list of all the primes below N.
   */
  public static ArrayList<Integer> getPrimesLessThan(int n) {
    ArrayList<Integer> a = new ArrayList<Integer>();
    a.add(2);
    for (int i = 3; i < n; i++) {
      boolean prime = true;
      for (int j : a) {
        if (j > Math.sqrt(i)) {
          break;
        }
        if (i % j == 0) {
          prime = false;
          break;
        }
      }
      if (prime) {
        a.add(i);
      }
    }
    return a;
  }
}
