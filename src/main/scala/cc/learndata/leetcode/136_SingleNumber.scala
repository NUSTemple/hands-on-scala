package cc.learndata.leetcode

object SingleNumber extends App {

    def singleNumber(nums: Array[Int]): Int = {
        var m = scala.collection.mutable.Map[Int, Int]()
        for (x <- nums)
            m(x) = m.getOrElse(x, 0) + 1
        m.filter(x => x._2 == 1 ).toSeq(0)._1

    }
} 