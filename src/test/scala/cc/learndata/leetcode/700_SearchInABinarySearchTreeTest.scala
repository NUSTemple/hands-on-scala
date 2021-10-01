package cc.learndata.leetcode

import org.scalatest.FunSuite

class SearchInABinarySearchTreeTest extends FunSuite {
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


    val testResult =
      SearchInABinarySearchTree.searchBST(node1, 2)

    val node1t = new TreeNode(2)
    val node2t = new TreeNode(1)
    val node3t = new TreeNode(3)
    
    node1t.left = node2t
    node1t.right = node3t

    val expectResult = node1t
    assert(testResult === expectResult)

  }


    // test 2
  test("test 2") {
    val node1 = new TreeNode(4)
    val node2 = new TreeNode(2)
    val node3 = new TreeNode(7)
    val node4 = new TreeNode(1)
    val node5 = new TreeNode(3)

    node1.left = node2
    node1.right = node3
    node2.left = node4
    node2.right = node5

    val testResult =
      SearchInABinarySearchTree.searchBST(node1, 5)

    val node1t = null

    val expectResult = node1t
    assert(testResult === expectResult)

  }

}