class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    longestConsecutive(nums) {
        if (nums.length<1)return 0;
        let max1=Number.MIN_SAFE_INTEGER;
        let count=1;
        nums=[...new Set(nums)].sort((a,b)=>a-b)
        for(let i=0;i<nums.length-1;i++){
           if(nums[i+1]-nums[i]==1){
             count++;
           }else{
              max1=Math.max(count,max1);
              count=1;
           }
        }
        max1=Math.max(count,max1);
        return max1;
    }
}
