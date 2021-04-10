package nc

import utils.ListNode

fun main(){
    fun reverseKGroup(head: ListNode?,k: Int): ListNode?  {
        if(head?.next == null || k<2) return head

        var now=head
        var depth=0
        while(now!=null){
            now=now.next
            depth++
        }

        val dummy=ListNode(0)
        dummy.next=head
        var jHead:ListNode?=head // j 循环的头部
        var jNode: ListNode? // j 循环内部真正一步一步往下走的
        var singleDummy:ListNode=dummy // 每个 j 循环的哨兵节点

        for(i in 0 until depth/k){
            for(j in 1 until k){
                jNode=jHead!!.next // jNode 先变到下一个
                jHead.next=jNode!!.next // jHead 指向 jNode 的下一个
                jNode.next=singleDummy.next // jNode 指向哨兵节点的下一个(即上一个数)
                singleDummy.next=jNode // 哨兵节点指向尾部 (jNode)
            }
            // 哨兵节点变成 jHead(因为 jHead 的下一个指向 jNode 的下一个, 也就是下一个循环的开始,
            //          而哨兵节点也是指向下一个循环的开始)
            singleDummy=jHead!!
            jHead=jHead.next
        }
        return dummy.next
    }
    val input=ListNode.fromIntArray(intArrayOf(1,2,3,4,5))
    println(reverseKGroup(input,2))
}