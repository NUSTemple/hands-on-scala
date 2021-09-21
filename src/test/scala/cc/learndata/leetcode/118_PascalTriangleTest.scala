package cc.learndata.leetcode

import org.scalatest.FunSuite

class PascalTriangleTest extends FunSuite {

  // test 1
  test("test 1") {
      val testArray = 
      PascalTriangle.generate(5)
    val expectResult = List(List(1), List(1, 1), List(1, 2, 1), List(1, 3, 3, 1), List(1, 4, 6, 4, 1))
    assert(testArray == expectResult)

  }

  // test 2
  test("test 2") {
      val testArray = 
      PascalTriangle.generate(1)
    val expectResult = List(List(1))
    assert(testArray == expectResult)

  }

}