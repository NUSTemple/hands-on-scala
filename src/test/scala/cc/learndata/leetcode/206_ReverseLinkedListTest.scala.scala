package cc.learndata.leetcode

import org.scalatest.FunSuite

class ReverseLinkedListTest extends FunSuite {

  // test 1
  test("test 1") {
      val testArray = 
      ReverseLinkedList.reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))))
    val expectResult = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))))
    assert(testArray.toString === expectResult.toString)
  }

    // test 2
  test("test 2") {
      val testArray = 
      ReverseLinkedList.reverseList(new ListNode(1, new ListNode(2)))
    val expectResult = new ListNode(2, new ListNode(1))
    assert(testArray.toString === expectResult.toString)
  }

      // test 3
  test("test 3") {
      val testArray = 
      ReverseLinkedList.reverseList(null)
    val expectResult = null
    assert(testArray === expectResult)
  }

}

