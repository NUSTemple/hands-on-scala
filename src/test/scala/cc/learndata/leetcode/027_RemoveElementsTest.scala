package cc.learndata.leetcode

import org.scalatest.FunSuite

class RemoveElementsTest extends FunSuite {

  // test 1
  test("test 1") {
    val testResult =
      RemoveElements.removeElements(Array(3,2,2,3), 3)
    val expectResult = 2
    assert(testResult == expectResult)

  }

    // test 2
  test("test 2") {
    val testResult =
      RemoveElements.removeElements(Array(0,1,2,2,3,0,4,2), 2)
    val expectResult = 5
    assert(testResult == expectResult)

  }

}