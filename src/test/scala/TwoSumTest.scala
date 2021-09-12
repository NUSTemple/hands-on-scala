package cc.learndata.leetcode

import org.scalatest.FunSuite

class TwoSumTest extends FunSuite {

    // test 1
    test("the name is set correctly in constructor") {
        val testResult = TwoSum.findSumPair(Array(1, 2, 3, 4, 6, 7, 8), 14)
        val expectResult = Array(1, 3)
        assert(testResult === expectResult)
    }

}
