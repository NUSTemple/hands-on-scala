package cc.learndata.leetcode

import org.scalatest.FunSuite

class ReverseWordsInAStringIIITest extends FunSuite {
  //Test 1
  test("test 1"){
    val testResult =
      ReverseWordsInAStringIII.reverse("hello world")
    val expectResult = "olleh dlrow"
    assert(testResult === expectResult)

  }

}
