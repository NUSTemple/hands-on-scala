package cc.learndata.leetcode

object MergeTwoSortedList extends App {
  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    if (l1 == null) return l2

    if (l2 == null) return l1

    if (l1.next != null) {
      if (l2.next != null) {
        if (l1.x > l2.x) new ListNode(l2.x, mergeTwoLists(l1, l2.next))
        else new ListNode(l1.x, mergeTwoLists(l1.next, l2))
      } else {
        if (l1.x > l2.x) new ListNode(l2.x, l1)
        else new ListNode(l1.x, mergeTwoLists(l1.next, l2))
      }
    } else {
      if (l1.x > l2.x) new ListNode(l2.x, mergeTwoLists(l1, l2.next))
      else new ListNode(l1.x, l2)

    }
  }
}
