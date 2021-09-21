package cc.learndata.leetcode

import org.scalatest.FunSuite

class RotatedArrayTest extends FunSuite {

  // test 1
  test("test 1") {
      val testArray = Array(1,2,3,4,5,6,7)
      RotatedArray.rotatedArray(testArray, 3)
    val expectResult = Array(5,6,7,1,2,3,4)
    assert(testArray === expectResult)

  }

  // test 2
  test("test 2") {
      val testArray = Array(-1,-100,3,99)
      RotatedArray.rotatedArray(testArray, 2)
    val expectResult = Array(3,99, -1,-100)
    assert(testArray === expectResult)

  }

}