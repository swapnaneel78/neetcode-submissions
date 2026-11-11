class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minwindow = Integer.MAX_VALUE;
        int i,j;
        int sum =0;
        for(i=0,j=0;i<nums.length && j<nums.length ;i++){
            sum=sum+nums[i];
            while(sum>=target){
                minwindow=Math.min(i-j+1,minwindow);
                sum-=nums[j];
                j++;
            }

        }
        return minwindow==Integer.MAX_VALUE?0:minwindow;

    }
}