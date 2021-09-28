package cc.learndata.leetcode

object ValidParentheses extends App {

  def isValid(s: String): Boolean = {

    var q = List[Char]()
    val m = Map(')' -> '(', ']' -> '[', '}' -> '{')
    val sa = s.toCharArray()
    sa.foreach { x =>
      {
        if (m.getOrElse(x, 'a') != 'a') {

          if (q.length > 0 && q.last == m.getOrElse(x, 'a')) q = q.dropRight(1)
          else return false
        } else {

          q = q ++ List(x)
        }
      }
    }

    if (q.length > 0) false else true

  }

}
