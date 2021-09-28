package cc.learndata.leetcode

object Combinations extends App {

    def combine(n: Int, k: Int): List[List[Int]] = {
        
        (1 to n).combinations(k).map(x => x.toList).toList
    }
  
}
