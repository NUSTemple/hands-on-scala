package cc.learndata.leetcode

import org.scalatest.FunSuite

class MaximumSubarrayTest extends FunSuite {

  // test 1
  test("test 1") {
    val testResult =
      MaximumSubarray.maximumSubarray(Array(-2,1,-3,4,-1,2,1,-5,4))
    val expectResult = 6
    assert(testResult == expectResult)

  }


    // test 2
  test("test 2") {
    val testResult =
      MaximumSubarray.maximumSubarray(Array(1))
    val expectResult = 1
    assert(testResult == expectResult)

  }

      // test 3
  test("test 3") {
    val testResult =
      MaximumSubarray.maximumSubarray(Array(5,4,-1,7,8))
    val expectResult = 23
    assert(testResult == expectResult)

  }

        // test 4
  test("test 4") {
    val testResult =
      MaximumSubarray.maximumSubarray(Array(-1))
    val expectResult = -1
    assert(testResult == expectResult)

  }

          // test 5
  test("test 5") {
    val testResult =
      MaximumSubarray.maximumSubarray(Array(-2, -1))
    val expectResult = -1
    assert(testResult == expectResult)

  }



}
