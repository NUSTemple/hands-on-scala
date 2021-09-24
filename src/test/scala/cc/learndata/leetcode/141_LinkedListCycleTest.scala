package cc.learndata.leetcode

import org.scalatest.FunSuite

class LinkedListCycleTest extends FunSuite {

  // test 1
  test("test 1") {
    val head = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4, new ListNode(2)))))
    val testArray = LinkedListCycle.hasCycle(head)
    val expectResult = true
    assert(testArray === expectResult)

  }

  // test 2
  test("test 2") {
    val head = new ListNode(1, new ListNode(2, new ListNode(1)))
    val testArray = LinkedListCycle.hasCycle(head)
    val expectResult = true
    assert(testArray === expectResult)
  }

    test("test 3") {
    val head = new ListNode(1)
    val testArray = LinkedListCycle.hasCycle(head)
    val expectResult = false
    assert(testArray === expectResult)
  }


}
