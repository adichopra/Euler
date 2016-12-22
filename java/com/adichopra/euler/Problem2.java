package com.adichopra.euler;

/**
 * This class finds the sum of all the even-valued terms of the Fibonacci
 * sequence that do not exceed four million.
 */
public class Problem2 {

  public static void main(String[] args) {
    int n = 4000000;
    Fibonacci f = new Fibonacci(n);
    System.out.println(fib(f, n));
  }

  /*
   * Computes the sum of all the even-valued terms of the Fibonacci
   * sequence that do not exceed N.
   */
  public static int fib(Fibonacci f, int n) {
    int sum = 0;
    int i = 0;
    int currFib = 0;
    while (i < n && currFib <= n) {
      currFib = f.nthFib(i);
      if (currFib % 2 == 0) {
        sum += currFib;
      }
      i += 1;
    }
    return sum;
  }
}
