package cc.learndata.leetcode

import org.scalatest.FunSuite

class RomanToIntegerTest extends FunSuite {

    // test 1
    test("Test 1") {
        val testResult = RomanToInteger.romanToInteger("III")
        val expectResult = 3
        assert(testResult === expectResult)
    }

            // test 1
    test("Test 2") {
        val testResult = RomanToInteger.romanToInteger("IV")
        val expectResult = 4
        assert(testResult === expectResult)
    }

            // test 1
    test("Test 3") {
        val testResult = RomanToInteger.romanToInteger("IX")
        val expectResult = 9
        assert(testResult === expectResult)
    }

            // test 1
    test("Test 4") {
        val testResult = RomanToInteger.romanToInteger("LVIII")
        val expectResult = 58
        assert(testResult === expectResult)
    }

                    // test 1
    test("Test 5") {
        val testResult = RomanToInteger.romanToInteger("MCMXCIV")
        val expectResult = 1994
        assert(testResult === expectResult)
    }

}