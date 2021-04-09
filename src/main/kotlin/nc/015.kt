package nc

import utils.TreeNode

fun main() {
    var tmpQue = ArrayDeque<TreeNode>()
    var que = ArrayDeque<TreeNode>()
    fun levelOrder(root: TreeNode?): Array<IntArray> {
        if (root == null) return arrayOf()
        val res = arrayListOf<IntArray>()
        que.add(root)
        while (que.isNotEmpty()) {
            val arr = IntArray(que.size)
            var i = que.size
            do {
                que.removeFirst().run {
                    arr[--i] = `val` // 反向添加元素, 因为下面是先添加右子树再添加左子树的
                    if (right != null) tmpQue.addLast(right!!)
                    if (left != null) tmpQue.addLast(left!!)
                }
            } while (que.isNotEmpty())
            res.add(arr)
            que = tmpQue
            tmpQue = ArrayDeque<TreeNode>()
        }
        return res.toTypedArray()
    }
}