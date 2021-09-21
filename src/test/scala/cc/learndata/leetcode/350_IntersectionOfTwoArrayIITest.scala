package cc.learndata.leetcode

import org.scalatest.FunSuite

class IntersectionOfTwoArrayIITest extends FunSuite {

  // test 1
  test("test 1") {
    val testResult =
      IntersectionOfTwoArraysII.intersect(Array(1, 2, 2, 1), Array(2, 2))
    val expectResult = Array(2, 2)
    assert(testResult === expectResult)

  }
  // test 2
  test("test 2") {
    val testResult =
      IntersectionOfTwoArraysII.intersect(Array(4, 9, 5), Array(9, 4, 9, 8, 4))
    val expectResult = Array(4, 9)
    assert(testResult.toSet === expectResult.toSet)
  }

}
