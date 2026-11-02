class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int val=map.get(nums[i])+1;
                map.put(nums[i],val);
            }else{
                map.put(nums[i],1);
            }
        }
        int num=nums.length+1;
        int result=-1;
        for(int i=1;i<=num;i++){
           if(!map.containsKey(i)){
            result=i;
            break;
           }
        }
        return result;
    }
}