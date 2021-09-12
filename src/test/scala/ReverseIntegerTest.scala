package cc.learndata.leetcode

import org.scalatest.FunSuite

class ReverseIntegerTest extends FunSuite {
  test("test 1") {
    val i = 123
    val testResult = ReverseInteger.reverseInteger(i)
    val expectResult = 321
    assert(testResult == expectResult)
  }

  test("test 2") {
    val i = -123
    val testResult = ReverseInteger.reverseInteger(i)
    val expectResult = -321
    assert(testResult == expectResult)
  }

  test("test 3") {
    val i = 120
    val testResult = ReverseInteger.reverseInteger(i)
    val expectResult = 21
    assert(testResult == expectResult)
  }

  test("test 4") {
    val i = 0
    val testResult = ReverseInteger.reverseInteger(i)
    val expectResult = 0
    assert(testResult == expectResult)
  }

      test("test 5") {
    val i = 1534236469 
    val testResult = ReverseInteger.reverseInteger(i)
    val expectResult = 0
    assert(testResult == expectResult)
  }

}
