package cc.learndata.leetcode

import org.scalatest.FunSuite

class RansomNoteTest extends FunSuite {

  // test 1
  test("test 1") {
    val testResult =
      RansomNote.canConstruct("a", "b")
    val expectResult = false
    assert(testResult == expectResult)

  }
  // test 2
  test("test 2") {
    val testResult =
      RansomNote.canConstruct("aa", "ab")
    val expectResult = false
    assert(testResult == expectResult)
  }

    // test 3
  test("test 3") {
    val testResult =
      RansomNote.canConstruct("aa", "aab")
    val expectResult = true
    assert(testResult == expectResult)
  }

      // test 4
  test("test 4") {
    val testResult =
      RansomNote.canConstruct("aab", "baa")
    val expectResult = true
    assert(testResult == expectResult)
  }
}