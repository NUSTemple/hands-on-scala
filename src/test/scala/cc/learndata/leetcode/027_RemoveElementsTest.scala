package cc.learndata.leetcode

import org.scalatest.FunSuite

class RemoveElementsTest extends FunSuite {

  // test 1
  test("test 1") {
    val testResult =
      RemoveElements.removeElements(Array(1, 1, 2), 1)
    val expectResult = 2
    assert(testResult == expectResult)

  }

}