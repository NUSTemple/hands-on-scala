package cc.learndata.leetcode

object ValidAnagram extends App {

  def isAnagram(s: String, t: String): Boolean = {
    val s1 = s.toCharArray().sorted
    val t1 = t.toCharArray().sorted

    s1.mkString("") == t1.mkString("")
  }
}