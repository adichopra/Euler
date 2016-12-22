package com.adichopra.euler;

/**
 * This class finds the first triangle number to have over five hundred
 * divisors.
 */
public class Problem12 {

  public static void main(String[] args) {
    System.out.println(triangleWithNDivisors(500));
  }

  /**
   * Computes the first triangle number to have over N divisors.
   */
  public static int triangleWithNDivisors(int n) {
    int x = 1;
    int counter = 1;
    while (Primes.factorize(x).size() * 2 < n) {
      counter++;
      x = counter * (1 + counter) / 2;
    }
    return x;
  }
}
