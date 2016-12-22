package com.adichopra.euler;

/**
 * This class finds the 10001st prime number.
 */
public class Problem7 {

  public static void main(String[] args) {
    System.out.println(nthPrime(10001));
  }

  /**
   * Computes the Nth prime number.
   */
  public static int nthPrime(int n) {
    int i = 0;
    int j = 0;
    while (i <= n) {
      j++;
      if (Primes.isPrime(j)) {
        i++;
      }
    }
    return j;
  }
}
