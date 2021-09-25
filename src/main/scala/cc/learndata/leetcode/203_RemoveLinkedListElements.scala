package cc.learndata.leetcode

object RemoveLinkedListElements extends App {

    def removeElements(head: ListNode, e: Int): ListNode = {

        if (head == null) return null

        if (head.x != e) { new ListNode(head.x, removeElements(head.next, e))} else removeElements(head.next, e)


    }

}