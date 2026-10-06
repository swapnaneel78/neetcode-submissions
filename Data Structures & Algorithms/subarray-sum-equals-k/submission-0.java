class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        map.put(0,1);
        for(int i=0;i<prefix.length;i++){
            int sum=prefix[i]-k;
            if(map.containsKey(sum)){
               int val=map.get(sum);
                count=count+val;
            }
            if (map.containsKey(prefix[i])) {
                map.put(prefix[i], map.get(prefix[i]) + 1);
            } else {
                map.put(prefix[i], 1);
            }
        }
        return count;
    }
}