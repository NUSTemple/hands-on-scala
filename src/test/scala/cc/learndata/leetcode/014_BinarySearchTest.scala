package cc.learndata.leetcode

import org.scalatest.FunSuite

class BinarySearchTest extends FunSuite {

  // test 1
  test("test 1") {
    val testResult =
      BinarySearch.binarySearch(Array(-1, 0, 3, 5, 9, 12), 9)
    val expectResult = 4
    assert(testResult == expectResult)

  }

  // test 2
  test("test 2") {
    val testResult =
      BinarySearch.binarySearch(Array(-1, 0, 3, 5, 9, 12), 2)
    val expectResult = -1
    assert(testResult == expectResult)

  }

  // test 3
  test("test 3") {
    val testResult =
      BinarySearch.binarySearch(Array(5), 5)
    val expectResult = 0
    assert(testResult == expectResult)

  }

    // test 4
  test("test 4") {
    val testResult =
      BinarySearch.binarySearch(Array(2, 5), 5)
    val expectResult = 1
    assert(testResult == expectResult)

  }


}
