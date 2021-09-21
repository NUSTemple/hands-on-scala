package cc.learndata.leetcode

import org.scalatest.FunSuite

class RemoveDuplicatesTest extends FunSuite {

  // test 1
  test("test 1") {
    val testResult =
      RemoveDuplicates.removeDuplicates(Array(1, 1, 2))
    val expectResult = 2
    assert(testResult == expectResult)

  }

}
