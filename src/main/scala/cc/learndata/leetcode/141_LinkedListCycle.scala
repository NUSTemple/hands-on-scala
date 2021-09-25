package cc.learndata.leetcode

object LinkedListCycle extends App {
  def hasCycle(head: ListNode): Boolean = {
      // Result is copied from https://leetcode.com/problems/linked-list-cycle/discuss/1310292/Clean-Scala-Solution
    var slow = head
    var fast = head

    var result = false

    while (!result && fast != null && fast.next != null) {
      fast = fast.next
      // check cycle
      if (fast == slow) {
        result = true
      }
      slow = slow.next
      fast = fast.next
    }
    return result
  }

}
