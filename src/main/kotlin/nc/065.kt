package nc

fun main() {
    fun Fibonacci(n: Int): Int = when (n) {
        0 -> 0
        1 -> 1
        else -> Fibonacci(n - 1) + Fibonacci(n - 2)
    }


    fun Fibonacci2(n: Int): Int {
        if(n==0) return 0
        val arr = IntArray(n + 1)
        arr[0] = 0
        arr[1] = 1
        for (i in 2..n) arr[i] = arr[i - 1] + arr[i - 2]
        return arr[n]
    }
}