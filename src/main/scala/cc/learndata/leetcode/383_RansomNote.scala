package cc.learndata.leetcode

import scala.collection.mutable.ArrayBuffer


object RansomNote extends App {
  def canConstruct(ransomNote: String, magazine: String): Boolean = {

    var ransomNoteArray = ransomNote.toCharArray().toBuffer
    var magazineArray = magazine.toCharArray().toBuffer
    var flag = true
    var i = 0

    for (r <- ransomNoteArray) {
        flag = true
        i = 0
        val startLength = magazineArray.length
        while (i < startLength && flag) {
            if (r == magazineArray(i)) {
            magazineArray.remove(i) 
            flag = false
            }
            i = i + 1
            println(r, i, magazineArray.length, startLength)
        }

        val endLength = magazineArray.length

        if (startLength == endLength) {
            return false
        }

    }

    true
  }
}