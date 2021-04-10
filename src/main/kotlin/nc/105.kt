package nc

fun main() {
    fun search(nums: IntArray,target: Int): Int {
        if(nums.isEmpty()) return -1
        var l=0
        var r=nums.size
        var mid:Int
        while(l<r){
            mid=l+(r-l)/2
            if(nums[mid]>=target)r=mid
            else if(nums[mid]<target)l=mid+1
        }
        return if(nums[l]==target) l else -1
    }
}