package com.adichopra.euler;

/**
 * This class finds the starting number, under one million, that produces the
 * longest Collatz sequence.
 */
public class Problem14 {

  public static void main(String[] args) {
    System.out.println(longestCollatz(1000000));
  }

  /**
   * Computes the starting number, under N, that produces the longest Collatz
   * sequence.
   */
  public static int longestCollatz(int n) {
    int highest = 0;
    int highest_i = 0;
    for (int i = 1; i < n; i++) {
      int chain_size = collatz(i);
      if (chain_size > highest) {
        highest = chain_size;
        highest_i = i;
      }
    }
    return highest_i;
  }

  /**
   * Computes the length of the Collatz sequence beginning at N..
   */
  public static int collatz(long n) {
    int length = 1;
    while (n != 1) {
      n = n % 2 == 0 ? n / 2: 3 * n + 1;
      length++;
    }
    return length;
  }
}
