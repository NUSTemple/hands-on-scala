package cc.learndata.leetcode

import org.scalatest.FunSuite

class PopulatingNextRightPointersInEachNodeTest extends FunSuite {

  // test 1
  test("test 1") {
    val node1 = new Node(1)
    val node2 = new Node(2)
    val node3 = new Node(3)
    val node4 = new Node(4)
    val node5 = new Node(5)
    val node6 = new Node(6)
    val node7 = new Node(7)
    
    node1.left = node2
    node1.right = node3
    node2.left = node4
    node2.right = node5
    node3.left = node6
    node3.right = node7
    val testResult = PopulatingNextRightPointersInEachNode.connect(node1)

    val node1t = new Node(1)
    val node2t = new Node(2)
    val node3t = new Node(3)
    val node4t = new Node(4)
    val node5t = new Node(5)
    val node6t = new Node(6)
    val node7t = new Node(7)
    
    node1t.left = node2t
    node1t.right = node3t
    node2t.left = node4t
    node2t.right = node5t
    node2t.next = node3t
    node3t.left = node6t
    node3t.right = node7t
    node4t.next = node5t
    node5t.next = node6t
    node6t.next = node7t

    val expectResult = node1t
    assert(testResult === expectResult)

  }
}