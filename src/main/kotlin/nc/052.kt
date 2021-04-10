package nc

fun main() {
    fun isValid(s: String): Boolean {
        val que = ArrayDeque<Char>(s.length)
        for (c in s) {
            when (c) {
                '(' -> que.addLast(')')
                '[' -> que.addLast(']')
                '{' -> que.addLast('}')
                else -> if (que.isEmpty() || que.removeLast() != c) {
                    return false
                }
            }
        }
        return que.isEmpty()
    }
}