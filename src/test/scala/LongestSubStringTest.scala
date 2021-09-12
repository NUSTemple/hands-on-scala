package cc.learndata.leetcode

import org.scalatest.FunSuite

class LongestSubStringTest extends FunSuite {

  // test 1
  test("Longest Sub String 1") {
    val testResult = LongestSubString.lengthOfLongestSubstring("abcabcbb")
    val expectResult = 3
    assert(testResult == expectResult)
  }

  // test 2
  test("Longest Sub String 2") {
    val testResult = LongestSubString.lengthOfLongestSubstring("bbbbb")
    val expectResult = 1
    assert(testResult == expectResult)
  }

  // test 3
  test("Longest Sub String 3") {
    val testResult = LongestSubString.lengthOfLongestSubstring("pwwkew")
    val expectResult = 3
    assert(testResult == expectResult)
  }

      // test 4
  test("Longest Sub String 4") {
    val testResult = LongestSubString.lengthOfLongestSubstring(" ")
    val expectResult = 1
    assert(testResult == expectResult)
  }

          // test 5
  test("Longest Sub String 5") {
    val testResult = LongestSubString.lengthOfLongestSubstring("")
    val expectResult = 0
    assert(testResult == expectResult)
  }

}
