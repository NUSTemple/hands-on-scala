package cc.learndata.leetcode

import org.scalatest.FunSuite

class ValidAnagramTest extends FunSuite {

  // test 1
  test("test 1") {
    val testResult =
      ValidAnagram.isAnagram(s = "anagram", t = "nagaram")
    val expectResult = true
    assert(testResult == expectResult)

  }

    // test 2
  test("test 2") {
    val testResult =
      ValidAnagram.isAnagram(s = "rat", t = "car")
    val expectResult = false
    assert(testResult == expectResult)

  }

}