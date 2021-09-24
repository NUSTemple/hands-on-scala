package cc.learndata.leetcode

import org.scalatest.FunSuite

class FloodFillTest extends FunSuite {

  // test 1
  test("test 1") {
    val testResult =
      FloodFill.floodFill(
        Array(Array(1, 1, 1), Array(1, 1, 0), Array(1, 0, 1)), 1, 1, 2)
    val expectResult = Array(Array(2, 2, 2), Array(2, 2, 0), Array(2, 0, 1))
    assert(testResult === expectResult)

  }

  // test 2
  test("test 2") {
    val testResult =
      FloodFill.floodFill(Array(Array(0, 0, 0), Array(0, 0, 0)), 0, 0, 2)
    val expectResult = Array(Array(2, 2, 2), Array(2, 2, 2))
    assert(testResult === expectResult)

  }

    // test 3
  test("test 3") {
    val testResult =
      FloodFill.floodFill(Array(Array(0, 0, 0), Array(0, 1, 0)), 1, 1, 2)
    val expectResult = Array(Array(0, 0, 0), Array(0, 2, 0))
    assert(testResult === expectResult)

  }

}
