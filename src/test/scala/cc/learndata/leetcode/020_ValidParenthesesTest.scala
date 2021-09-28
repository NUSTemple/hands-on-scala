package cc.learndata.leetcode

import org.scalatest.FunSuite
class ValidParenthesesTest extends FunSuite {

      // test 1
  test("test 1") {
    val testResult =
      ValidParentheses.isValid("()")
    val expectResult = true
    assert(testResult.toString == expectResult.toString)

  }

      // test 2
  test("test 2") {
    val testResult =
      ValidParentheses.isValid("()[]{}")
    val expectResult = true
    assert(testResult.toString == expectResult.toString)
  }

      // test 3
  test("test 3") {
    val testResult =
      ValidParentheses.isValid("(]")
    val expectResult = false
    assert(testResult.toString == expectResult.toString)
  }

   // test 4
  test("test 4") {
    val testResult =
      ValidParentheses.isValid("([)]")
    val expectResult = false
    assert(testResult.toString == expectResult.toString)
  }

   // test 5
  test("test 5") {
    val testResult =
      ValidParentheses.isValid("{[]}")
    val expectResult = true
    assert(testResult.toString == expectResult.toString)
  }

     // test 6
  test("test 6") {
    val testResult =
      ValidParentheses.isValid("]")
    val expectResult = true
    assert(testResult.toString == expectResult.toString)
  }
  
}
