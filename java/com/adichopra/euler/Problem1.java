package com.adichopra.euler;

/**
 * This class finds the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 {
  
  public static void main(String[] args) {
    System.out.println(sum(1000));
  }

  /**
   * Computes the sum of all multiples of 3 or 5 below N.
   */
  public static int sum(int n) {
    int sum = 0;
    for (int i = 1; i < n; i++) {
      if (i % 5 == 0 || i % 3 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}
