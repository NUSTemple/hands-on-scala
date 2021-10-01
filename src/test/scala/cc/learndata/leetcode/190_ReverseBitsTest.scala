package cc.learndata.leetcode

import org.scalatest.FunSuite

class ReverseBitsTest extends FunSuite {

  // test 1
  test("test 1") {
    val testArray = ReverseBits.reverseBits(Integer.parseInt("00000010100101000001111010011100", 2))
    val expectResult = 964176192
    assert(testArray == expectResult)

  }

    // test 2
  test("test 2") {
    val testArray = ReverseBits.reverseBits(-3)
    val expectResult = -1073741825
    assert(testArray == expectResult)

  }
}
