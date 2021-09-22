package cc.learndata.leetcode

import org.scalatest.FunSuite

class MiddleOfLinkedListTest extends FunSuite {

  test("test 1") {
    val testResult =
      MiddleOfLinkedList.middleNode(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))))
    val expectResult = new ListNode(3, new ListNode(4, new ListNode(5)))
    assert(testResult.toString == expectResult.toString)

  }


    test("test 2") {
    val testResult =
      MiddleOfLinkedList.middleNode(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))))
    val expectResult = new ListNode(4, new ListNode(5, new ListNode(6)))
    assert(testResult.toString == expectResult.toString)

  }

      test("test 3") {
    val testResult =
      MiddleOfLinkedList.middleNode(new ListNode(1))
    val expectResult = new ListNode(1)
    assert(testResult.toString == expectResult.toString)

  }




}