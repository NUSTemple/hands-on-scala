package cc.learndata.leetcode

import org.scalatest.FunSuite 

class Search2DMatrixTest extends FunSuite {

  // test 1
  test("test 1") {
    val testResult =
      Search2DMatrix.searchMatrix(Array(Array(1,3,5,7),Array(10,11,16,20),Array(23,30,34,60)), 3)
    val expectResult = true
    assert(testResult == expectResult)

  }


    // test 2
  test("test 2") {
    val testResult =
      Search2DMatrix.searchMatrix(Array(Array(1,3,5,7),Array(10,11,16,20),Array(23,30,34,60)), 13)
    val expectResult = false
    assert(testResult == expectResult)

  }
}