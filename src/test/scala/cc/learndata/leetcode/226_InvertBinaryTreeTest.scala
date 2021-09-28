package cc.learndata.leetcode

import org.scalatest.FunSuite

class InvertBinaryTreeTest extends FunSuite {
  // test 1
  test("test 1") {
    val node1 = new TreeNode(4)
    val node2 = new TreeNode(2)
    val node3 = new TreeNode(7)
    val node4 = new TreeNode(1)
    val node5 = new TreeNode(3)
    val node6 = new TreeNode(6)
    val node7 = new TreeNode(9)

    node1.left = node2
    node1.right = node3
    node2.left = node4
    node2.right = node5
    node3.left = node6
    node3.right = node7
  
    val testResult = InvertBinaryTree.invertTree(node1)

    val node1t = new TreeNode(4)
    val node2t = new TreeNode(2)
    val node3t = new TreeNode(7)
    val node4t = new TreeNode(1)
    val node5t = new TreeNode(3)
    val node6t = new TreeNode(6)
    val node7t = new TreeNode(9)

    node1t.right = node2t
    node1t.left = node3t
    node2t.right = node4t
    node2t.left = node5t
    node3t.right = node6t
    node3t.left = node7t

    val expectResult = node1t
    assert(testResult === expectResult)

  }

  // test 2
  test("test 2") {
    val node1 = new TreeNode(2)
    val node2 = new TreeNode(1)
    val node3 = new TreeNode(3)

    node1.left = node2
    node1.right = node3

    val testResult = InvertBinaryTree.invertTree(node1)

    val node1t = new TreeNode(2)
    val node2t = new TreeNode(1)
    val node3t = new TreeNode(3)

    node1t.right = node2t
    node1t.left = node3t

    val expectResult = node1t

    assert(testResult === expectResult)
  }

    test("test 3") {
    val node1 = null

    val testResult = InvertBinaryTree.invertTree(node1)

    val expectResult = null
    assert(testResult === expectResult)
  }
}
