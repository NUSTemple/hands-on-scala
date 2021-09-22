package cc.learndata.leetcode

object RemoveNthNodeFromEndOfList extends App {
  def removeNthFromEnd(head: ListNode, n: Int): ListNode = {

    var i = 0
    var next = head
    var arr = Array[Int]()
    while (next != null) {
      arr = arr :+ next.x
      next = next.next
      i = i + 1
    }
    arr = arr.take(i - n) ++ arr.takeRight(n).drop(1)

    if (arr.length >= 1) ArrayToListNode(arr) else new ListNode()
  }

  def ArrayToListNode(l: Array[Int]): ListNode = {
    if (l.size >= 2) {
      new ListNode(l(0), ArrayToListNode(l.drop(1)))
    } else {
      new ListNode(l(0))
    }
  }
}
