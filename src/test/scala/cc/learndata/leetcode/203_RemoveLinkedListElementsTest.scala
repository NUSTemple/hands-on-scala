package cc.learndata.leetcode

import org.scalatest.FunSuite

class RemoveLinkedListElementsTest extends FunSuite {

  // test 1
  test("test 1") {
      val testArray = 
      RemoveLinkedListElements.removeElements(new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))))), 6)
    val expectResult = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))
    assert(testArray.toString === expectResult.toString)

  }

  // test 2
  test("test 2") {
      val testArray = 
      RemoveLinkedListElements.removeElements(new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7)))), 7)
    val expectResult = null
    assert(testArray === expectResult)

  }

}