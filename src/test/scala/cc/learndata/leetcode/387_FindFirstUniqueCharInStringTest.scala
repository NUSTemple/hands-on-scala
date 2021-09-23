package cc.learndata.leetcode

import org.scalatest.FunSuite

class FindFirstUniqueCharInStringTest extends FunSuite {

  // test 1
  test("test 1") {
    val testResult =
      FindFirstUniqueCharInString.firstUniqChar("leetcode")
    val expectResult = 0
    assert(testResult == expectResult)

  }
  // test 2
  test("test 2") {
    val testResult =
      FindFirstUniqueCharInString.firstUniqChar("loveleetcode")
    val expectResult = 2
    assert(testResult == expectResult)
  }

    // test 3
  test("test 3") {
    val testResult =
      FindFirstUniqueCharInString.firstUniqChar("aabb")
    val expectResult = -1
    assert(testResult == expectResult)
  }
}