package nc

import utils.ListNode

fun main(){
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode?  {
        val start=ListNode(0)
        var now1=l1?:return l2
        var now2=l2?:return l1
        var now:ListNode=start
        while(true){
            if(now1.`val`>now2.`val`){
                now.next=now2
                if(now2.next==null){ // 链表2 为空, 剩余元素指向 now1, 返回烧饼节点
                    now2.next=now1
                    return start.next
                }
                now2=now2.next!!
            }else{
                now.next=now1
                if(now1.next==null){
                    now1.next=now2
                    return start.next
                }
                now1=now1.next!!
            }
            now=now.next!!
        }
    }
}