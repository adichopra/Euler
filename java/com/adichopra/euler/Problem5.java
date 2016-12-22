package com.adichopra.euler;

/**
 * This class finds the smallest positive number that is evenly divisible by
 * all of the numbers from 1 to 20.
 */
public class Problem5 {
    
  public static void main(String[] args) {
    System.out.println(smallestDivisible(20));
  }

  /**
   * Computes the smallest positive number that is evenly divisible by all of
   * the numbers from 1 to N.
   */
  public static int smallestDivisible(int n) {
    boolean divisible = true;
    int i = 1;
    while (true) {
      divisible = true;
      for (int j = 1; j <= n; j++) {
        if (i % j != 0) {
          divisible = false;
          break;
        }
      }
      if (divisible) {
        return i;
      }
      i++;
    }
  }
}
