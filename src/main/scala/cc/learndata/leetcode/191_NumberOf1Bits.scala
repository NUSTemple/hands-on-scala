package cc.learndata.leetcode

object NumberOf1Bits extends App {

    def hammingWeight(n: Int): Int = {
        
        n.toBinaryString.replace("0", "").length
        
    }
  
}
