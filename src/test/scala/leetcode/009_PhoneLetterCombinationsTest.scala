package cc.learndata.leetcode

import org.scalatest.FunSuite

class PhoneLetterCombinationsTest extends FunSuite {
      // test 1
          test("test 1") {
      val testResult = PhoneLetterCombinations.letterCombinations("23")
      val expectResult = List("ad","ae","af","bd","be","bf","cd","ce","cf")
      assert(testResult === expectResult)
    }
}