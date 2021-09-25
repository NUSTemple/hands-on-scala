package cc.learndata.leetcode

import org.scalatest.FunSuite

class MergeTwoSortedListTest extends FunSuite {

      // test 1
  test("test 1") {
      val l1 = new ListNode(1, new ListNode(2, new ListNode(4)))
      val l2 = new ListNode(1, new ListNode(3, new ListNode(4)))
    val testResult =
      MergeTwoSortedList.mergeTwoLists(l1, l2)
    val expectResult = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))))
    assert(testResult.toString === expectResult.toString)

  }

        // test 2
  test("test 2") {
      val l1: ListNode = new ListNode(0)
      val l2: ListNode = new ListNode(0)
    val testResult =
      MergeTwoSortedList.mergeTwoLists(l1, l2)
    val expectResult: ListNode = new ListNode(0, new ListNode(0))
    assert(testResult.toString == expectResult.toString)

  }

  //         // test 3
  // test("test 3") {
  //     val l1 = null
  //     val l2 = null
  //   val testResult =
  //     MergeTwoSortedList.mergeTwoLists(l1, l2)
  //   val expectResult = null
  //   assert(testResult.toString == expectResult.toString)

  // }

            // test 4
  test("test 4") {
      val l1 = new ListNode(-10, new ListNode(-10, new ListNode(-9, new ListNode(-4, new ListNode(1,new ListNode(6, new ListNode(6)))))))
    val l2 = new ListNode(-7)
    val testResult = 
      MergeTwoSortedList.mergeTwoLists(l1, l2)
    val expectResult = new ListNode(-10, new ListNode(-10, new ListNode(-9, new ListNode(-7, new ListNode(-4, new ListNode(1, new ListNode(6, new ListNode(6))))))))
    assert(testResult.toString == expectResult.toString)

  }
  
}
