package cc.learndata.leetcode

import org.scalatest.FunSuite

class PowerOfTwoTest extends FunSuite {

  // test 1
  test("test 1") {
    val testResult = PowerOfTwo.isPowerOfTwo(1)
    val expectResult = true
    assert(testResult == expectResult)

  }

  // test 2
  test("test 2") {
    val testResult = PowerOfTwo.isPowerOfTwo(16)
    val expectResult = true
    assert(testResult == expectResult)

  }

  // test 3
  test("test 3") {
    val testResult = PowerOfTwo.isPowerOfTwo(3)
    val expectResult = false
    assert(testResult == expectResult)

  }

  // test 4
  test("test 4") {
    val testResult = PowerOfTwo.isPowerOfTwo(4)
    val expectResult = true
    assert(testResult == expectResult)

  }

  // test 5
  test("test 5") {
    val testResult = PowerOfTwo.isPowerOfTwo(5)
    val expectResult = false
    assert(testResult == expectResult)

  }

}
