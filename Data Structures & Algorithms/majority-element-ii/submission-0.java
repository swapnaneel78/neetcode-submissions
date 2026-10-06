class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length/3;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int val=map.get(nums[i])+1;
                map.put(nums[i],val);
            }else{
                map.put(nums[i],1);
            }
        }

        for(int val:map.keySet()){
            if(map.get(val)>n){
                list.add(val);
            }
        }
        return list;
        
    }
}