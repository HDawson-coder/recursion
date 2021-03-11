package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

class PalindromesTest {

//  @DisplayName("checkRecursive(non-exceptional)")
//  @ParameterizedTest(name = "[{index}] Asserting checkRecursive({0}) == {1}.")
//  @CsvFileSource(resources = "palindromes-test-non-exception.csv", numLinesToSkip = 1)
//  void computeRecursive_nonException(String n, Boolean expected) {
//    assertEquals(expected, Palindromes.checkRecursive(n));
//  }
//
//  @DisplayName("checkRecursive(exceptional)")
//  @ParameterizedTest(name = "[{index}] Asserting checkRecursive({0}) != {1}.")
//  @CsvFileSource(resources = "palindromes-test-exception.csv", numLinesToSkip = 1)
//  void computeRecursive_exception(String n, Boolean expected) {
//    assertFalse(expected, Palindromes.checkRecursive(n));
//  }

  @ParameterizedTest
  @CsvFileSource(resources = "palindromes-tests.csv", numLinesToSkip = 1)
  public void computeRecursive(boolean n) {
      System.out.println(n);
  }
}