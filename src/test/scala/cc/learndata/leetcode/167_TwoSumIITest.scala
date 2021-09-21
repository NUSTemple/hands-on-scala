package cc.learndata.leetcode

import org.scalatest.FunSuite

class TwoSumIITest extends FunSuite {

  // test 1
  test("test 1") {
    val testArray = TwoSumII.twoSum(Array(2, 7, 11, 15), 9)
    val expectResult = Array(1, 2)
    assert(testArray === expectResult)

  }

  // test 2
  test("test 2") {
    val testArray = TwoSumII.twoSum(Array(2, 3, 4), 6)
    val expectResult = Array(1, 3)
    assert(testArray === expectResult)

  }

  // test 3
  test("test 3") {
    val testArray = TwoSumII.twoSum(Array(-1, 0), -1)
    val expectResult = Array(1, 2)
    assert(testArray === expectResult)

  }
}
