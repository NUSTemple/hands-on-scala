package cc.learndata.leetcode

import org.scalatest.FunSuite

class LetterCasePermutationTest extends FunSuite {
  
      // test 1
  test("test 1") {
    val testResult =
      LetterCasePermutation.letterCasePermutation("a1b2")
    val expectResult = List("a1b2","a1B2","A1b2","A1B2")
    assert(testResult.toSet == expectResult.toSet)
  }

        // test 2
  test("test 2") {
    val testResult =
      LetterCasePermutation.letterCasePermutation("3z4")
    val expectResult = List("3z4","3Z4")
    assert(testResult.toSet == expectResult.toSet)
  }

          // test 3
  test("test 3") {
    val testResult =
      LetterCasePermutation.letterCasePermutation("12345")
    val expectResult = List("12345")
    assert(testResult.toSet == expectResult.toSet)
  }

            // test 4
  test("test 4") {
    val testResult =
      LetterCasePermutation.letterCasePermutation("0")
    val expectResult = List("0")
    assert(testResult.toSet == expectResult.toSet)
  }



}
