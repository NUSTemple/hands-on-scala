package cc.learndata.leetcode

import org.scalatest.FunSuite

class PermutationInStringTest extends FunSuite {

  test("test 1") {
    val testResult =
      PermutationInString.checkInclusion("ab", "eidbaooo")
    val expectResult = true
    assert(testResult === expectResult)
  }

    test("test 2") {
    val testResult =
      PermutationInString.checkInclusion("ab", "eidboaoo")
    val expectResult = false
    assert(testResult === expectResult)
  }
}