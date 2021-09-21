package cc.learndata.leetcode

import org.scalatest.FunSuite

class BestTimeToBuyAndSellStocksTest extends FunSuite {

  // test 1
  test("test 1") {
    val testArray = BestTimeToBuyAndSellStocks.maxProfit(Array(7,1,5,3,6,4))
    val expectResult = 5
    assert(testArray === expectResult)

  }

    // test 2
  test("test 2") {
    val testArray = BestTimeToBuyAndSellStocks.maxProfit(Array(7,6,4,3,1))
    val expectResult = 0
    assert(testArray === expectResult)

  }
    

}