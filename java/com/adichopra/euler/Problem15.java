package com.adichopra.euler;

/**
 * This class finds the number of routes through a 20x20 grid, starting at the
 * top left corner. The only valid moves are down and right.
 */
public class Problem15 {

  public static void main(String[] args) {
    System.out.println(numRoutes(20));
  }

  /**
   * Computes the number of routes through an NxN grid.
   */
  public static long numRoutes(int n) {
    long product = 1;
    for (int i = 0; i < n; i++){ 
      product *= (2 * n - i);
      product /= (i + 1);
    }
    return product;
  }
}
