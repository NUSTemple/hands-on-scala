package cc.learndata.leetcode

import org.scalatest.FunSuite

class MergeTwoBinaryTreeTest extends FunSuite {

  test("test 1") {

    val t1 = new TreeNode(1, new TreeNode(3, new TreeNode(5)), new TreeNode(2))
    val t2 = new TreeNode(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(7)))

    val testResult = MergeTwoBinaryTree.mergeTrees(t1, t2)
    val expectResult = new TreeNode(3, new TreeNode(4, new TreeNode(5), new TreeNode(4)), new TreeNode(5, null, new TreeNode(7)))
    assert(testResult === expectResult)

  }

  test("test 2") {

    val t1 = new TreeNode(1)
    val t2 = new TreeNode(1, new TreeNode(2))

    val testResult = MergeTwoBinaryTree.mergeTrees(t1, t2)
    val expectResult = new TreeNode(2, new TreeNode(2))
    assert(testResult === expectResult)
  }

}
