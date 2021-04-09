package nc

import utils.ListNode

fun main() {
    fun ReverseList(head: ListNode?): ListNode? {
        var pre = head ?: return null
        var now = pre.next
        var tmp: ListNode?
        head.next = null
        while (now != null) {
            tmp = now.next
            now.next = pre
            if (tmp != null) {
                pre = now
                now = tmp
            } else {
                return now
            }
        }
        return pre
    }
}