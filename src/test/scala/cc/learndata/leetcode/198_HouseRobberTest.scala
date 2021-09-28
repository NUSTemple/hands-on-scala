package cc.learndata.leetcode

import org.scalatest.FunSuite

class HouseRobberTest extends FunSuite {

  // test 1
  test("test 1") {
      val testArray = 
      HouseRobber.rob(Array(1,2,3,1))
    val expectResult = 4
    assert(testArray == expectResult)

  }


    // test 2
  test("test 2") {
      val testArray = 
      HouseRobber.rob(Array(2,7,9,3,1))
    val expectResult = 12
    assert(testArray == expectResult)

  }

}
