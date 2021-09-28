package cc.learndata.leetcode

import org.scalatest.FunSuite

class ImplementQueueUsingStacksTest extends FunSuite {

        // test 2
  test("test 2") {
    val testResult =
      new MyQueue()
    testResult.push(1)
    testResult.push(2)
    val test1 = testResult.pop()
    assert(test1 == 1)
    val test2 = testResult.peek()
    assert(test2 == 2)
    val test3 = testResult.empty()
    assert(test3 == false)
  }
  
}
