package cc.learndata.leetcode

import org.scalatest.FunSuite

class CombinationsTest extends FunSuite {

      // test 1
  test("test 1") {
    val testResult =
      Combinations.combine(4, 2)
    val expectResult = List(List(2, 4), List(3, 4), List(1, 2), List(1, 3), List(1, 4), List(2, 3))
    assert(testResult.toSet == expectResult.toSet)

  }

        // test 2
  test("test 2") {
    val testResult =
      Combinations.combine(1, 1)
    val expectResult = List(List(1))
    assert(testResult.toSet == expectResult.toSet)

  }

  
}
