package cc.learndata.leetcode

import org.scalatest.FunSuite 

class RemoveDuplicatesFromSortedListTest extends FunSuite {

  // test 1
  test("test 1") {
      val l1 = new ListNode(1, new ListNode(1, new ListNode(2)))
    val testResult =
      RemoveDuplicatesFromSortedList.deleteDuplicates(l1)
    val expectResult = new ListNode(1, new ListNode(2))
    assert(testResult.toString == expectResult.toString)

  }

    // test 2
  test("test 2") {
      val l1 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))))
    val testResult =
      RemoveDuplicatesFromSortedList.deleteDuplicates(l1)
    val expectResult = new ListNode(1, new ListNode(2, new ListNode(3)))
    assert(testResult.toString == expectResult.toString)

  }


}