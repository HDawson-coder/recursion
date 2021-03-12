package edu.cnm.deepdive;

public class Palindromes {

  public static boolean checkRecursive(String s) {

    return s.length() <= 1
        || s.charAt(0) == s.charAt(s.length() - 1)
        && checkRecursive(s.substring(1, s.length() - 1));
  }

  public static boolean checkIterative(String s) {
    for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
    }
    return true;
  }
}

