package edu.cnm.deepdive;

public class Palindromes {

  public static boolean checkRecursive(String n)  {
    int i = 0, j = n.length() - 1;
    while (i < j) {
      if (n.charAt(i) != n.charAt(j))
        return false;
      i++;
      j--;
    }
    return true;
  }
}
