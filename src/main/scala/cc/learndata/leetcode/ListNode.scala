package cc.learndata.leetcode

case class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x

  override def toString(): String = {

    this match {
      case l: ListNode => if (l.next != null) l.x + " --> " + l.next.toString() else l.x.toString
      case _       => ""
    }

  }
}
