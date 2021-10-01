package cc.learndata.leetcode


object SearchInABinarySearchTree extends App {
    def searchBST(root: TreeNode, `val`: Int): TreeNode = {

        if (root == null) return null

        if (root.value == `val` ) root 
        else if (root.value > `val`) searchBST(root.left, `val`) 
        else searchBST(root.right, `val`) 
        
    }
}