class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        let j=0
        nums.sort((a,b)=>a-b)
        for(let i=1;i<nums.length;i++){
            if(nums[i]!==nums[j]){
                nums[++j]=nums[i]
            }else{return true}
        }
        return false
    }
}
