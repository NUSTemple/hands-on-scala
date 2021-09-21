package cc.learndata.leetcode

object ReverseString extends App {
  def reverseString(s: Array[Char]): Unit = {
    val sCp = s.clone.reverse
    var i = 0
    s.foreach(x => {
      s(i) = sCp(i)
      i += 1
    })
  }
}
