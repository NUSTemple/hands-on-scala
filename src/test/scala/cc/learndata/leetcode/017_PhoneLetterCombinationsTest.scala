package cc.learndata.leetcode

import org.scalatest.FunSuite

class PhoneLetterCombinationsTest extends FunSuite {
  // test 1
  test("test 1") {
    val testResult = PhoneLetterCombinations.letterCombinations("23")
    val expectResult =
      List("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")
    assert(testResult === expectResult)
  }

  // test 2
  test("test 2") {
    val testResult = PhoneLetterCombinations.letterCombinations("")
    val expectResult = List()
    assert(testResult === expectResult)
  }

  // test 3
  test("test 3") {
    val testResult = PhoneLetterCombinations.letterCombinations("2")
    val expectResult = List("a", "b", "c")
    assert(testResult === expectResult)
  }
}
