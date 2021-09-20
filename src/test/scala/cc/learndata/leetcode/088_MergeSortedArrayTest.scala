package cc.learndata.leetcode

import org.scalatest.FunSuite

class MergeSortedArrayTest extends FunSuite {

  // test 1
  test("test 1") {
      val testArray = Array(1,2,3,0,0,0)
      MergeSortedArray.mergeSortedArray(testArray, 3,Array(2,5,6), 3)
    val expectResult = Array(1,2,2,3,5,6)
    assert(testArray === expectResult)

  }

  // test 2
  test("test 2") {
      val testArray = Array(1)
      MergeSortedArray.mergeSortedArray(testArray, 1, Array[Int](), 0)
    val expectResult = Array(1)
    assert(testArray === expectResult)

  }

    // test 3
  test("test 3") {
      val testArray = Array(0)
      MergeSortedArray.mergeSortedArray(testArray, 0, Array(1), 1)
    val expectResult = Array(1)
    assert(testArray === expectResult)

  }

}