package cc.learndata.leetcode

import org.scalatest.FunSuite

class TwoSumV2Test extends FunSuite {

  // test 1
  test("test 1") {
    val testResult = TwoSumV2.findSumPair(Array(1, 2, 3, 4, 6, 7, 8), 14)
    val expectResult = Array(4, 6)
    assert(testResult === expectResult)
  }


      // test 2
        test("test 2") {
    val testResult = TwoSumV2.findSumPair(Array(3, 2, 4), 6)
    val expectResult = Array(1, 2)
    assert(testResult === expectResult)
  }

}
