package cc.learndata.leetcode

object RemoveDuplicatesFromSortedList extends App {

  def deleteDuplicates(head: ListNode): ListNode = {

    def deleteDuplicates(head: ListNode, l: ListNode, i: Int): ListNode = {
      if (head == null) l
      else {
        if (head.x == i) deleteDuplicates(head.next, l, i)
        else {
          deleteDuplicates(head.next, new ListNode(head.x, l), head.x)
        }
      }

    }

    def reverseList(head: ListNode): ListNode = {

      def reverseList(head: ListNode, in: ListNode): ListNode = {
        if (head == null) return in

        reverseList(head.next, new ListNode(head.x, in))
      }

      if (head == null) null
      else reverseList(head.next: ListNode, new ListNode(head.x))
    }

    if (head == null) null
    else {

      reverseList(deleteDuplicates(head.next, new ListNode(head.x), head.x))
    }
  }

}
