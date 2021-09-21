package cc.learndata.leetcode

import org.scalatest.FunSuite

class IntegerToRomanTest extends FunSuite {

  // test 1
  test("1st test") {
    val testResult = IntegerToRoman.integerToRoman(3)
    val expectResult = "III"
    assert(testResult == expectResult)
  }

      // test 2
  test("2nd test") {
    val testResult = IntegerToRoman.integerToRoman(4)
    val expectResult = "IV"
    assert(testResult == expectResult)
  }

          // test 3
  test("3rd test") {
    val testResult = IntegerToRoman.integerToRoman(9)
    val expectResult = "IX"
    assert(testResult == expectResult)
  }

              // test 4
  test("4th test") {
    val testResult = IntegerToRoman.integerToRoman(58)
    val expectResult = "LVIII"
    assert(testResult == expectResult)
  }

                  // test 5
  test("5th test") {
    val testResult = IntegerToRoman.integerToRoman(1994)
    val expectResult = "MCMXCIV"
    assert(testResult == expectResult)
  }

}
