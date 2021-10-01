package cc.learndata.leetcode

import org.scalatest.FunSuite

class TwoSumIVInputIsABSTTest extends FunSuite {

    // test 1
  test("test 1") {
    val node1 = new TreeNode(5)
    val node2 = new TreeNode(3)
    val node3 = new TreeNode(6)
    val node4 = new TreeNode(2)
    val node5 = new TreeNode(4)
    val node6 = new TreeNode(7)

    node1.left = node2
    node1.right = node3
    node2.left = node4
    node2.right = node5
    node3.right = node6

    val testResult = TwoSumIVInputIsABST.findTarget(node1, 9)

    val expectResult = true
    assert(testResult == expectResult)
}

    // test 2
  test("test 2") {
    val node1 = new TreeNode(5)
    val node2 = new TreeNode(3)
    val node3 = new TreeNode(6)
    val node4 = new TreeNode(2)
    val node5 = new TreeNode(4)
    val node6 = new TreeNode(7)

    node1.left = node2
    node1.right = node3
    node2.left = node4
    node2.right = node5
    node3.right = node6

    val testResult = TwoSumIVInputIsABST.findTarget(node1, 28)

    val expectResult = false
    assert(testResult == expectResult)
}


  // test 3
  test("test 3") {
    val node1 = new TreeNode(2)
    val node2 = new TreeNode(1)
    val node3 = new TreeNode(3)

    node1.left = node2
    node1.right = node3

    val testResult = TwoSumIVInputIsABST.findTarget(node1, 4)

    val expectResult = true
    assert(testResult == expectResult)
}


  // test 4
  test("test 4") {
    val node1 = new TreeNode(2)
    val node2 = new TreeNode(1)
    val node3 = new TreeNode(3)

    node1.left = node2
    node1.right = node3

    val testResult = TwoSumIVInputIsABST.findTarget(node1, 1)

    val expectResult = false
    assert(testResult == expectResult)
}

  // test 5
  test("test 5") {
    val node1 = new TreeNode(2)
    val node2 = new TreeNode(1)
    val node3 = new TreeNode(3)

    node1.left = node2
    node1.right = node3

    val testResult = TwoSumIVInputIsABST.findTarget(node1, 3)

    val expectResult = true
    assert(testResult == expectResult)
}


}

