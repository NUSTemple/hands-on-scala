package cc.learndata.leetcode

import org.scalatest.FunSuite

class FindMaxTreeDepthTest extends FunSuite {
  // test 1
  test("test 1") {
    val node1 = new TreeNode(3)
    val node2 = new TreeNode(9)
    val node3 = new TreeNode(20)
    val node4 = new TreeNode(15)
    val node5 = new TreeNode(7)
    
    node1.left = node2
    node1.right = node3
    node3.left = node4
    node3.right = node5

    val testResult = FindMaxTreeDepth.maxDepth(node1)

    val expectResult = 3
    assert(testResult == expectResult)

  }

    test("test 2") {
    val node1 = new TreeNode(1)
    val node2 = new TreeNode(2)
    
    node1.right = node2
    val testResult = FindMaxTreeDepth.maxDepth(node1)

    val expectResult = 2
    assert(testResult == expectResult)

  }

      test("test 3") {
    val node1 = null

    val testResult = FindMaxTreeDepth.maxDepth(node1)

    val expectResult = 0
    assert(testResult == expectResult)

  }

        test("test 4") {
    val node1 = new TreeNode(0)

    val testResult = FindMaxTreeDepth.maxDepth(node1)

    val expectResult = 1
    assert(testResult == expectResult)

  }

}
