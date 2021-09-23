package cc.learndata.leetcode

object PermutationInString extends App {
  def checkInclusion(s1: String, s2: String): Boolean = {

    val s1Length = s1.length
    val s2Length = s2.length

    if (s1Length < s2Length) {


      if ((s1.split("").toSet -- s2.split("").toSet).toList.length > 0) {
          return false
      }

      for (i <- 0 to (s2.length - s1.length)) {
        val s2Sub = s2.slice(i, i + s1Length)

        if (s1.sorted == s2Sub.sorted) {
          return true
        }
      }

    }

    false
  }
}
