package com.adichopra.euler;

/**
 * A utility class to compute numbers from the Fibonacci sequence.
 */
public class Fibonacci {
  private static int[] fibTable;

  public Fibonacci(int n) {
    this.fibTable = new int[n];
  }

  /*
   * Computes the Nth number of the Fibonacci sequence.
   */
  public int nthFib(int n) {
    if (n <= 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    if (this.fibTable[n] == 0) {
      this.fibTable[n] = nthFib(n - 2) + nthFib(n - 1);
    }
    return this.fibTable[n];
  }
}
