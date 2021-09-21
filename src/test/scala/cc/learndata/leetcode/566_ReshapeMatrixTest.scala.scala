package cc.learndata.leetcode

import org.scalatest.FunSuite

class ReshapeMatrixTest extends FunSuite {

  test("test 1") {
    val testResult =
      ReshapeMatrix.matrixReshape(Array(Array(1, 2), Array(3, 4)), 1, 4)
    val expectResult = Array(Array(1, 2, 3, 4))
    assert(testResult === expectResult)
  }

  test("test 2") {
    val testResult =
      ReshapeMatrix.matrixReshape(Array(Array(1, 2), Array(3, 4)), 2, 4)
    val expectResult = Array(Array(1, 2), Array(3, 4))
    assert(testResult === expectResult)
  }

}
