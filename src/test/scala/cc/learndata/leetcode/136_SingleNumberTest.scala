package cc.learndata.leetcode

import org.scalatest.FunSuite

class SingleNumberTest extends FunSuite {

  test("test 1") {
    val head = Array(2,2,1)
    val testArray = SingleNumber.singleNumber(head)
    val expectResult = 1
    assert(testArray == expectResult)

  }

  test("test 2") {
    val head = Array(4,1,2,1,2)
    val testArray = SingleNumber.singleNumber(head)
    val expectResult = 4
    assert(testArray == expectResult)

  }

  test("test 3") {
    val head = Array(1)
    val testArray = SingleNumber.singleNumber(head)
    val expectResult = 1
    assert(testArray == expectResult)

  }



}