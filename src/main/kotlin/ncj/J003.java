package ncj;

import utils.ListNode;

public class J003 {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode fastNode=head,slowNode=head;
        ListNode meet=null;
        while(fastNode!=null && fastNode.next!=null){
            fastNode=fastNode.next.next;
            slowNode=slowNode.next;
            if(fastNode==slowNode){
                meet=slowNode;
                break;
            }
        }
        if(meet==null) return null;
        ListNode pre=new ListNode(0);
        pre.next=head;
        if(head==pre) return pre;
        while(head!=null){
            // 删除前节点到当前节点的指向, 最后一个元素有两个 node 指向
            // 即最后一个就是入口节点
            pre.next=null;
            pre=head;
            head=head.next;
        }
        return pre;
    }
    public ListNode detectCycle2(ListNode head) {
        if(head==null) return null;
        ListNode fastNode=head,slowNode=head;
        ListNode meet=null;
        while(fastNode!=null && fastNode.next!=null){
            fastNode=fastNode.next.next;
            slowNode=slowNode.next;
            if(fastNode==slowNode){
                meet=slowNode;
                break;
            }
        }
        if(meet==null) return null;
        ListNode pre=new ListNode(0);
        pre.next=head;
        if(head==pre) return pre;
        while(head!=null){
            if (slowNode==head) return slowNode;
            // 指针从前面再遇到慢节点
            // 第一次循环快指针多走了(几圈 + 一个链)
            // 第二个循环慢指针比新指针多走了(几圈)
            // 那么他们就会在一个链的位置相遇
            head=head.next;
            slowNode=slowNode.next;
        }
        return slowNode;
    }
}
