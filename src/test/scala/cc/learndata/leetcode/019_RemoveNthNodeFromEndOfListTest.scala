package cc.learndata.leetcode

import org.scalatest.FunSuite

class RemoveNthNodeFromEndOfListTest extends FunSuite {

  test("test 1") {
    val testResult =
      RemoveNthNodeFromEndOfList.removeNthFromEnd(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2)
    val expectResult = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5))))
    assert(testResult.toString == expectResult.toString)

  }


    test("test 2") {
    val testResult =
      RemoveNthNodeFromEndOfList.removeNthFromEnd(new ListNode(1), 1)
    val expectResult = new ListNode()
    assert(testResult.toString == expectResult.toString)

  }

      test("test 3") {
    val testResult =
      RemoveNthNodeFromEndOfList.removeNthFromEnd(new ListNode(1, new ListNode(2)), 1)
    val expectResult = new ListNode(1)
    assert(testResult.toString == expectResult.toString)

  }

}