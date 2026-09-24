class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int val=map.get(nums[i]);
                map.put(nums[i],val+1);
            }else{
                map.put(nums[i],1);
            }
        }
        ArrayList<Integer>key=new ArrayList<>(map.keySet());
        key.sort((a,b)->map.get(b)-map.get(a));
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i] = key.get(i);

        }
        return result;
    }
}
