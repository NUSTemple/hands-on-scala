package cc.learndata.leetcode

import org.scalatest.FunSuite

class  InsertIntoABinarySearchTreeTest extends FunSuite {
  // test 1
  test("test 1") {
    val node1 = new TreeNode(4)
    val node2 = new TreeNode(2)
    val node3 = new TreeNode(7)
    val node4 = new TreeNode(1)
    val node5 = new TreeNode(3)

    node1.left = node2
    node1.right = node3
    node2.left = node4
    node2.right = node5

    val testResult = InsertIntoABinarySearchTree.insertIntoBST(node1, 5)

    val node1t = new TreeNode(4)
    val node2t = new TreeNode(2)
    val node3t = new TreeNode(7)
    val node4t = new TreeNode(1)
    val node5t = new TreeNode(3)
    val node6t = new TreeNode(5)

    node1t.left = node2t
    node1t.right = node3t
    node2t.left = node4t
    node2t.right = node5t
    node3t.left = node6t
    
    val expectResult = node1t
    assert(testResult === expectResult)

  }
}