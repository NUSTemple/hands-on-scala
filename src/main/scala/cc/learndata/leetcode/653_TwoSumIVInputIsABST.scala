package cc.learndata.leetcode

object TwoSumIVInputIsABST extends App {

    def findTarget(root: TreeNode, k: Int): Boolean = {

       
        def findTarget(n1: TreeNode, n2: TreeNode, target:Int): Boolean = {

            if (n1 == null || n2 == null ) false else {

                if (n1.value + n2.value == target && n1.value != n2.value) true 
                else if (n1.value + n2.value > target) {
                    findTarget(n1.left, n2, k) || findTarget(n1, n2.left, k)
                }
                else {
                    findTarget(n1.right, n2, k) || findTarget(n1, n2.right, k)
                }

            }


        }

        if (root.value * 2 > k) findTarget(root.left, root, k) else findTarget(root, root.right, k)

    }


}

