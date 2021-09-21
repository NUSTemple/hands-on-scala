package cc.learndata.leetcode

object ReverseWordsInAStringIII extends App {

  def reverse(s: String): String = {
    s.split(" ").map(x => x.reverse).mkString(" ")
  }
}
