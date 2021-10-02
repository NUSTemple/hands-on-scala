package cc.learndata.leetcode

import org.scalatest.FunSuite

class PalindromeNumberTest extends FunSuite {
  test("test 1") {
    val testResult = PalindromeNumber.isPalindromeNumber(121)
    val expectResult = true
    assert(testResult == expectResult)
  }

  test("test 2") {
    val testResult = PalindromeNumber.isPalindromeNumber(-121)
    val expectResult = false
    assert(testResult == expectResult)
  }

  test("test 3") {
    val testResult = PalindromeNumber.isPalindromeNumber(10)
    val expectResult = false
    assert(testResult == expectResult)
  }

  test("test 4") {
    val testResult = PalindromeNumber.isPalindromeNumber(-101)
    val expectResult = false
    assert(testResult == expectResult)
  }


    test("test 5") {
    val testResult = PalindromeNumber.isPalindromeNumberV2(121)
    val expectResult = true
    assert(testResult == expectResult)
  }

  test("test 6") {
    val testResult = PalindromeNumber.isPalindromeNumberV2(-121)
    val expectResult = false
    assert(testResult == expectResult)
  }

  test("test 7") {
    val testResult = PalindromeNumber.isPalindromeNumberV2(10)
    val expectResult = false
    assert(testResult == expectResult)
  }

  test("test 8") {
    val testResult = PalindromeNumber.isPalindromeNumberV2(-101)
    val expectResult = false
    assert(testResult == expectResult)
  }

}
