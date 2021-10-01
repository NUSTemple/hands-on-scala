package cc.learndata.leetcode

object LowestCommonAncestorOfABinarySearchTree extends App {

    def lowestCommonAncestor(root: TreeNode, p: TreeNode, q: TreeNode): TreeNode = {
        
        val pp = if (p.value < q.value) p else q
        val qq = if (p.value < q.value) q else p
        
        if ((pp.value < root.value && qq.value > root.value) 
            || (pp.value == root.value) 
            || (qq.value == root.value)) return root

        if (pp.value < root.value && qq.value < root.value) lowestCommonAncestor(root.left, pp, qq)
        else lowestCommonAncestor(root.right, pp, qq)

    }
  
}
