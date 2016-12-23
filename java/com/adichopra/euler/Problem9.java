package com.adichopra.euler;

/**
 * This class finds the product of the three numbers that satisfy the equation:
 * a + b + c = 1000.
 */
public class Problem9 {

  public static void main(String[] args) {
    System.out.println(findABC(1000));
  }

  /**
   * Computes the product of the three numbers that satisfy the equation:
   * a + b + c = N.
   */
  public static int findABC(int n) {
    for (int a = 1; a < n; a++) {
      for (int b = 1; b < n; b++) {
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b,  2));
        if ((int) c == c && a + b + c == n) {
          return (int) (a * b * c);
        }
      }
    }
    return -1;
  }
}
