class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left=new int[nums.length];
        int product = 1;
        for(int i=nums.length-1;i>=0;i--){
            left[i]=product;
            product=product*nums[i];
        }
        int right[]=new int[nums.length];
        product=1;
        for(int i=0;i<nums.length;i++){
            right[i]=product;
            product=product*nums[i];
        }
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=left[i]*right[i];
        }
        return result;
    }
}  
