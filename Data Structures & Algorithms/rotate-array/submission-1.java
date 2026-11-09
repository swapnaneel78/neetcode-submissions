class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        swap(0,nums.length-1,nums);
        swap(0,k-1,nums);
        swap(k,nums.length-1,nums);
    }
    public static void swap(int a,int b,int[] nums){
       while(a<b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
        a++;
        b--;
       }
    }
}