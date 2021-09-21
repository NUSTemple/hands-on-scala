package cc.learndata.leetcode

import org.scalatest.FunSuite

class AddTwoNumTest extends FunSuite {

    // test 1
    test("1st test") {
        val L1_3 = new ListNode(3)
        val L1_2 = new ListNode(4, L1_3)
        val L1_1 = new ListNode(2, L1_2)
        val L2_3 = new ListNode(4)
        val L2_2 = new ListNode(6, L2_3)
        val L2_1 = new ListNode(5, L2_2)
        val testResult = AddTwoNum.addTwoNumbers(L1_1, L2_1)
        
        val L3_3 = new ListNode(8)
        val L3_2 = new ListNode(0, L3_3)
        val L3_1 = new ListNode(7, L3_2)

        val expectResult = L3_1
        println(testResult)
        println(expectResult)
        assert(testResult == expectResult)
    }

    // test 2
        test("2nd test") {
            val L1 = AddTwoNum.ArrayToListNode(Array(1, 2, 3, 4))
            println(L1.toString())
            val L2 = AddTwoNum.ArrayToListNode(Array(5, 6, 7))
            println(L2.toString())
            val L3 = AddTwoNum.ArrayToListNode(Array(6, 8, 0, 5))

            val testResult = AddTwoNum.addTwoNumbers(L1, L2)
            val expectResult = L3
            println(testResult)
            println(expectResult)
            assert(testResult == expectResult)
        }


}
