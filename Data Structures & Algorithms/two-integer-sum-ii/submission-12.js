class Solution {
    twoSum(numbers, target) {
        let left=0
        let right=numbers.length-1
        while(left<right){
            let comp=numbers[left]+numbers[right]
            if(comp==target){
                return [++left,++right]
            }else if(comp<target){
                left++
            }else{
                right--
            }
        }
        return [-1,-1]
    }
}