package cc.learndata.leetcode

import org.scalatest.FunSuite

class RottingOrangesTest extends FunSuite {

  //Test 1
  test("test 1") {
    val m = Array(Array(2, 1, 1), Array(1, 1, 0), Array(0, 1, 1))
    val testResult =
      RottingOranges.orangesRotting(m)
    val expectResult = 4
    assert(testResult == expectResult)

  }

  //Test 2
  test("test 2") {
    val m = Array(Array(2, 1, 1), Array(0, 1, 1), Array(1, 0, 1))
    val testResult =
      RottingOranges.orangesRotting(m)
    val expectResult = -1
    assert(testResult == expectResult)

  }

  //Test 3
  test("test 3") {
    val m = Array(Array(0, 2))
    val testResult =
      RottingOranges.orangesRotting(m)
    val expectResult = 0
    assert(testResult == expectResult)

  }
}
