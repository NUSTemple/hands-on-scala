package cc.learndata.leetcode

import org.scalatest.FunSuite

class PermutationsTest extends FunSuite {

      // test 2
  test("test 2") {
    val testResult =
      Permutations.permute(Array(1, 2, 3))
    val expectResult = List(List(1,2,3),List(1,3,2),List(2,1,3),List(2,3,1),List(3,1,2),List(3,2,1))
    assert(testResult.toSet == expectResult.toSet)

  }

        // test 2
  test("test 2") {
    val testResult =
      Permutations.permute(Array(0, 1))
    val expectResult = List(List(0, 1), List(1,0))
    assert(testResult.toSet == expectResult.toSet)

  }

          // test 3
  test("test 3") {
    val testResult =
      Permutations.permute(Array(1))
    val expectResult = List(List(1))
    assert(testResult.toSet == expectResult.toSet)

  }
  
}
