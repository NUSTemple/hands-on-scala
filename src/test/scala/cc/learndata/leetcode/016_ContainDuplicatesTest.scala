package cc.learndata.leetcode

import org.scalatest.FunSuite

class ContainDuplicatesTest extends FunSuite {

  // test 1
  test("test 1") {
    val testResult =
      ContainDuplicates.containDuplicates(Array(-1, 0, 3, 5, 9, 12))
    val expectResult = false
    assert(testResult == expectResult)

  }

    // test 2
  test("test 2") {
    val testResult =
      ContainDuplicates.containDuplicates(Array(1,2,3,1))
    val expectResult = true
    assert(testResult == expectResult)

  }

      // test 3
  test("test 3") {
    val testResult =
      ContainDuplicates.containDuplicates(Array(1,1,1,3,3,4,3,2,4,2))
    val expectResult = true
    assert(testResult == expectResult)

  }

    // test 4
  test("test 4") {
    val testResult =
      ContainDuplicatesV2.containDuplicates(Array(-1, 0, 3, 5, 9, 12))
    val expectResult = false
    assert(testResult == expectResult)

  }

    // test 5
  test("test 5") {
    val testResult =
      ContainDuplicatesV2.containDuplicates(Array(1,2,3,1))
    val expectResult = true
    assert(testResult == expectResult)

  }

      // test 6
  test("test 6") {
    val testResult =
      ContainDuplicatesV2.containDuplicates(Array(1,1,1,3,3,4,3,2,4,2))
    val expectResult = true
    assert(testResult == expectResult)

  }

}