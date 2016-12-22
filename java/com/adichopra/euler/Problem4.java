package com.adichopra.euler;

/**
 * This class finds the largest palindrome made from the product of two 3-digit
 * numbers.
 */
public class Problem4 {

  public static void main(String[] args) {
    System.out.println(largestPalindrome(3));
  }

  /**
   * Computes the largest palindrome made from the product of two N-digit
   * numbers.
   */
  public static int largestPalindrome(int n) {
    int highest = 0;
    for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
      for (int j = (int) Math.pow(10, n - 1); j < Math.pow(10, n); j++) {
        if (palindrome(i * j) && i * j > highest) {
          highest = i * j;
        }
      }
    }
    return highest;
  }

  /**
   * Returns whether or not N is a palindrome.
   */
  public static boolean palindrome(int n) {
    String s = Integer.toString(n);
    for (int i = 0; i < s.length() / 2; i++) {
      if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
        return false;
      }
    }
    return true;
  }
}
