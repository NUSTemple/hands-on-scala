package cc.learndata.leetcode

object LongestSubString extends App {
  def lengthOfLongestSubstring(s: String): Int = {

    val sa = s.split("")
    var l = 0
    var r = 0
    var maxLength = 0
    var cMap = collection.mutable.Map[String, Int]()
    var idx = 1
    for (i <- sa if i > "") {

        val cIdx = cMap.getOrElse(i, -1)
        if (cIdx > 0) {
            r = idx
            l = l.max(cIdx)
            maxLength = (r-l).max(maxLength)
            cMap += (i -> idx)
        } 
        else {
            r = idx 
            maxLength = (r-l).max(maxLength)
            cMap += (i -> idx)
        }

        idx += 1
    }
    maxLength
  }
}
