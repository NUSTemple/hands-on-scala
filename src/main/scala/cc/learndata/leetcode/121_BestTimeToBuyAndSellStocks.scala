package cc.learndata.leetcode

object BestTimeToBuyAndSellStocks extends App {

  def maxProfit(prices: Array[Int]): Int = {
    var tmpMin = Int.MaxValue
    var tmpMaxProfit = 0 
    prices.foreach( x => 
        {
            tmpMin = tmpMin.min(x)
            tmpMaxProfit = (x - tmpMin).max(tmpMaxProfit)
        }
    )
    tmpMaxProfit

  }
}
