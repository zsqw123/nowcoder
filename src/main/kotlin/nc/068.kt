package nc

fun main(){
    fun jumpFloor(number: Int): Int  {
        if(number==0) return 1
        if(number<0) return 0
        return jumpFloor(number-1)+jumpFloor(number-2)
    }
}