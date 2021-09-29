package cc.learndata.leetcode

import org.scalatest.FunSuite

class NumberOf1BitsTest extends FunSuite {

  // test 1
  test("test 1") {
    val testArray = NumberOf1Bits.hammingWeight(Integer.parseInt("00000000000000000000000000001011", 2))
    val expectResult = 3
    assert(testArray === expectResult)

  }

  // test 2
  test("test 2") {
    val testArray = NumberOf1Bits.hammingWeight(Integer.parseInt("00000000000000000000000010000000", 2))
    val expectResult = 1
    assert(testArray === expectResult)

  }

    // test 3
  test("test 3") {
    val testArray = NumberOf1Bits.hammingWeight(Integer.parseInt("11111111111111111111111111111101", 2))
    val expectResult = 31
    assert(testArray === expectResult)

  }
  
}
