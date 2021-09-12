package cc.learndata.leetcode

class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
    
  override def toString(): String = {
      if (next != null)
        x.toString +  " --> " + next.toString()
      else {
          x.toString
      }

  }
}
object AddTwoNum extends App {

  def ArrayToListNode(l: Array[Int]): ListNode = {
      if (l.size >= 2) {
          new ListNode(l(0), ArrayToListNode(l.drop(1)))}
      else {
          new ListNode(l(0))
      }
  }

  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    addTwoNumbers(l1: ListNode, l2: ListNode, 0)
  }

  
  def addTwoNumbers(l1: ListNode, l2: ListNode, addOne: Int): ListNode = {
    val l1e1 = if (l1 != null) l1.x else 0
    val l1next = if (l1 != null) l1.next else null
    val l2e1 = if (l2 != null) l2.x else 0
    val l2next = if (l2 != null) l2.next else null
    val l3e1 = if (l1e1 + l2e1 + addOne >= 10)  l1e1 + l2e1 + addOne - 10  else l1e1 + l2e1 + addOne
    val l3addOne = if (l1e1 + l2e1 + addOne >= 10)  1  else 0

    if (( l1next != null  ) || ( l2next != null ) || (l3addOne > 0)) {
        new ListNode(l3e1, addTwoNumbers(l1next, l2next, l3addOne)) }
    else {
        new ListNode(l3e1)
    }

  }
}
