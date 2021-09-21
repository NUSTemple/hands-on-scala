package cc.learndata.leetcode

import org.scalatest.FunSuite


class LongestCommonPrefixTest extends FunSuite {

  // test 1
  test("test 1") {
    val testResult =
      LongestCommonPrefix.longestCommonPrefix(Array("flower", "flow", "flight"))
    val expectResult = "fl"
    assert(testResult === expectResult)
  }

  // test 2
  test("test 2") {
    val testResult =
      LongestCommonPrefix.longestCommonPrefix(Array("dog", "racecar", "car"))
    val expectResult = ""
    assert(testResult === expectResult)
  }

  // test 3
  test("test 3") {
    val testResult =
      LongestCommonPrefix.longestCommonPrefix(Array("", "car", "car"))
    val expectResult = ""
    assert(testResult === expectResult)
  }

  // test 4
  test("test 4") {
    val testResult =
      LongestCommonPrefix.longestCommonPrefix(Array("cards", "car", "car"))
    val expectResult = "car"
    assert(testResult === expectResult)
  }

}
