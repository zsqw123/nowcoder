package utils

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return `val`.toString() + " " + next.toString()
    }

    companion object {
        fun fromIntArray(intArray: IntArray): ListNode? {
            if (intArray.isEmpty()) return null
            val dummy = ListNode(0)
            var now = ListNode(intArray[0])
            dummy.next = now
            for (i in 1 until intArray.size) {
                val new = ListNode(intArray[i])
                now.next = new
                now = new
            }
            return dummy.next
        }
    }
}