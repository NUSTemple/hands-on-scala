package cc.learndata.leetcode

import org.scalatest.FunSuite

class SearchInsertPositionTest extends FunSuite {

  // test 1
  test("test 1") {
    val testResult =
      SearchInsertPosition.searchInsertPosition(Array(-1, 0, 3, 5, 9, 12), 2)
    val expectResult = 2
    assert(testResult == expectResult)

  }

  // test 2
  test("test 2") {
    val testResult =
      SearchInsertPosition.searchInsertPosition(Array(1, 3, 5, 6), 5)
    val expectResult = 2
    assert(testResult == expectResult)

  }

  // test 3
  test("test 3") {
    val testResult =
      SearchInsertPosition.searchInsertPosition(Array(1, 3, 5, 6), 2)
    val expectResult = 1
    assert(testResult == expectResult)

  }

  // test 4
  test("test 4") {
    val testResult =
      SearchInsertPosition.searchInsertPosition(Array(1, 3, 5, 6), 7)
    val expectResult = 4
    assert(testResult == expectResult)

  }

  // test 5
  test("test 5") {
    val testResult =
      SearchInsertPosition.searchInsertPosition(Array(1, 3, 5, 6), 0)
    val expectResult = 0
    assert(testResult == expectResult)

  }

  // test 6
  test("test 6") {
    val testResult =
      SearchInsertPosition.searchInsertPosition(Array(1), 0)
    val expectResult = 0
    assert(testResult == expectResult)

  }

}
