class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    longestConsecutive(nums) {
       let maxlen=0
       nums=new Set(nums)
        for(let val of nums){
            if(!nums.has(val-1)){
               let curval=val;
               let count=1
               while(nums.has(curval+1)){
                curval++;
                count++;
               }
                maxlen=Math.max(maxlen,count)
            }
        }
        return maxlen;
    }
}
