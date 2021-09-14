package cc.learndata.leetcode

object LongestCommonPrefix extends App {

  def longestCommonPrefix(strs: Array[String]): String = {
    strs.reduce(longestCommonPrefixTwoString(_, _))
  }

  def longestCommonPrefixTwoString(s1: String, s2: String): String = {
    (s1,s2).zipped.takeWhile(Function.tupled(_ == _)).unzip._1.mkString
  }
  
}
