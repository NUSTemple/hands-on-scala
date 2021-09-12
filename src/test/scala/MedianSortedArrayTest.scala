package cc.learndata.leetcode

import org.scalatest.FunSuite

class MedianSortedArrayTest extends FunSuite {
  test("test 1") {
    val l1 = Array(1, 3)
    val l2 = Array(2)

    val testResult = MedianSortedArray.findMedianSortedArrays(l1, l2)
    val expectResult = 2.0
    assert(testResult == expectResult)

  }

  test("test 2") {
    val l1 = Array(1, 2)
    val l2 = Array(3, 4)

    val testResult = MedianSortedArray.findMedianSortedArrays(l1, l2)
    val expectResult = 2.5
    assert(testResult == expectResult)

  }
  test("test 3") {
    val l1 = Array(0, 0)
    val l2 = Array(0, 0)

    val testResult = MedianSortedArray.findMedianSortedArrays(l1, l2)
    val expectResult = 0.0
    assert(testResult == expectResult)

  }

  test("test 4") {
    val l1: Array[Int] = Array()
    val l2 = Array(1)

    val testResult = MedianSortedArray.findMedianSortedArrays(l1, l2)
    val expectResult = 1
    assert(testResult == expectResult)

  }

  test("test 5") {
    val l1 = Array(2)
    val l2: Array[Int] = Array()

    val testResult = MedianSortedArray.findMedianSortedArrays(l1, l2)
    val expectResult = 2
    assert(testResult == expectResult)

  }

}
