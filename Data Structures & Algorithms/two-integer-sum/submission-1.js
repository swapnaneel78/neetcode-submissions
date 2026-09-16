class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        for(let j=0;j<nums.length;j++){
        for(let i=j+1;i<nums.length;i++){
            if(target==nums[j]+nums[i]){
                if(j>i){
                   return [i,j] 
                }else{
                    return[j,i]
                }
            }
        }
        
        }
        return [-1,-1]
    }
}
