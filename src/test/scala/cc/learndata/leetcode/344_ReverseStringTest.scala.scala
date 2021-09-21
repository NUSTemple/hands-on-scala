package cc.learndata.leetcode

import org.scalatest.FunSuite
import org.scalatest.funsuite.AnyFunSuite

class ReverseStringTest  extends AnyFunSuite{


    // test 1
    test("test 1") {
      val testArray = Array(0,1,0,3,12)
      MoveZeros.moveZeros(testArray)
    val expectResult = Array(1,3,12,0,0)
    assert(testArray === expectResult)

  }
    // test 2
    test("test 2") {
      val testArray = Array(0,1,0,3,12)
      MoveZeros.moveZeros(testArray)
    val expectResult = Array(1,3,12,0,0)
    assert(testArray === expectResult)

  }
  
}
