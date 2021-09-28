package cc.learndata.leetcode

import org.scalatest.FunSuite 

class ClimbingStairsTest extends FunSuite {

  // test 1
  test("test 1") {
    val testResult =
      ClimbingStairs.climbStairs(2)
    val expectResult = 2
    assert(testResult == expectResult)

  }

    // test 2
  test("test 2") {
    val testResult =
      ClimbingStairs.climbStairs(3)
    val expectResult = 3
    assert(testResult == expectResult)

  }

}
