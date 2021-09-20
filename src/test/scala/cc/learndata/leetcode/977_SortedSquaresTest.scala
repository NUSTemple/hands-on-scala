package cc.learndata.leetcode

import org.scalatest.FunSuite

class SortedSquaresTest extends FunSuite {

  // test 1
  test("test 1") {
    val testResult =
      SortedSquares.sortedSquares(Array(-4,-1,0,3,10))
    val expectResult = Array(0,1,9,16,100)
    assert(testResult === expectResult)

  }


    // test 2
  test("test 2") {
    val testResult =
      SortedSquares.sortedSquares(Array(-7,-3,2,3,11))
    val expectResult = Array(4,9,9,49,121)
    assert(testResult === expectResult)

  }


}