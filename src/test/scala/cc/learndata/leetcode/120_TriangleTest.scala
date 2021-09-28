package cc.learndata.leetcode

import org.scalatest.FunSuite

class TriangleTest extends FunSuite {

  // test 1
  test("test 1") {

    val input = List(List(2), List(3, 4), List(6, 5, 7), List(4, 1, 8, 3))
      val testArray = Triangle.minimumTotal(input)
    val expectResult = 11
    assert(testArray == expectResult)

  }

    // test 2
  test("test 2") {

    val input = List(List(-10))
      val testArray = Triangle.minimumTotal(input)
    val expectResult = -10
    assert(testArray == expectResult)

  }

}
