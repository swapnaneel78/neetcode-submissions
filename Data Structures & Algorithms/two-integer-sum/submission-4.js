class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    // twoSum(nums, target) {
    //    const map=new Map();
    //    for(let i=0;i<nums.length;i++){
    //     map.set(nums[i],i)
    //    }
    //    for(let i=0;i<nums.length;i++){
    //     if(map.has(target-nums[i])&& map.get(target-nums[i]) !== i){
    //         if(map.get(target-nums[i])>i){
    //             return[i,map.get(target-nums[i])]
    //         }else{
    //             return [map.get(target-nums[i]),i]
    //         }
    //     }
    //    }
    //    return [-1,-1]
    // }

    twoSum(nums, target) {
    const map = new Map();

    for(let i=0;i<nums.length;i++){
        const complement = target - nums[i];

        if(map.has(complement)){
            return [map.get(complement), i];
        }

        map.set(nums[i], i);
    }

    return [-1,-1];
}
}
