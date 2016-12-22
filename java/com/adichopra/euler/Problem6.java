package com.adichopra.euler;

/**
 * This class finds the difference between the sum of the squares of the first
 * one hundred natural numbers and the square of the sum.
 */
public class Problem6 {
    
  public static void main(String[] args) {
    System.out.println(sumSquareDifference(100));
  }

  /**
   * Computes the difference between the sum of the squares of the first N
   * natural numbers and the square of the sum.
   */
  public static int sumSquareDifference(int n) {
    int sum = 0;
    int sqsum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
      sqsum += Math.pow(i, 2);
    }
    return (int) Math.pow(sum, 2) - sqsum;
  }
}
