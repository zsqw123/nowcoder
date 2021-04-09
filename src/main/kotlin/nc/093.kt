package nc

fun main() {
    class LruMap(private val maxSize: Int) : LinkedHashMap<Int, Int>((Math.ceil(maxSize / 0.75) + 1).toInt(), 0.75f, true) {
        override fun removeEldestEntry(eldest: MutableMap.MutableEntry<Int, Int>?): Boolean {
            return size > maxSize
        }
    }

    fun LRU(operators: Array<IntArray>, k: Int): IntArray {
        val hashmap = LruMap(k)
        val res = arrayListOf<Int>()
        for (opt in operators) {
            if (opt[0] == 1) hashmap[opt[1]] = opt[2]
            else {
                val getted = hashmap[opt[1]] ?: -1
                res.add(getted)
            }
        }
        return res.toIntArray()
    }
}