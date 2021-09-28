package cc.learndata.leetcode

object ReverseLinkedList extends App {
  def reverseList(head: ListNode): ListNode = {

    def reverseList(head: ListNode, in: ListNode): ListNode = {
      if (head == null) return in

      reverseList(head.next, new ListNode(head.x, in))
    }

    if (head == null) null
    else reverseList(head.next: ListNode, new ListNode(head.x))
  }

}
